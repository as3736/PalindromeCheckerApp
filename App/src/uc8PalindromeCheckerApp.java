public class uc8PalindromeCheckerApp {

        static class Node {
            char data;
            Node next;

            Node(char data) {
                this.data = data;
                this.next = null;
            }
        }

        public static void main(String[] args) {

            String input = "madam";

            char[] charArray = input.toCharArray();

            Node head = null;
            Node tail = null;

            for (int i = 0; i < charArray.length; i++) {

                Node newNode = new Node(charArray[i]);

                if (head == null) {
                    head = newNode;
                    tail = newNode;
                } else {
                    tail.next = newNode;
                    tail = newNode;
                }
            }

            Node slow = head;
            Node fast = head;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }

            Node prev = null;
            Node current = slow;

            while (current != null) {
                Node next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }

            Node firstHalf = head;
            Node secondHalf = prev;

            boolean isPalindrome = true;

            while (secondHalf != null) {

                if (firstHalf.data != secondHalf.data) {
                    isPalindrome = false;
                    break;
                }

                firstHalf = firstHalf.next;
                secondHalf = secondHalf.next;
            }

            if (isPalindrome) {
                System.out.println(input + " is a Palindrome");
            } else {
                System.out.println(input + " is NOT a Palindrome");
            }
        }
    }

