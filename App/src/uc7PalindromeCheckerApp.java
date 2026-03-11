import java.util.ArrayDeque;
import java.util.Deque;

public class uc7PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "madam";

        char[] charArray = input.toCharArray();

        Deque<Character> deque = new ArrayDeque<>();

        for (int i = 0; i < charArray.length; i++) {
            deque.addLast(charArray[i]);
        }

        boolean isPalindrome = true;

        while (deque.size() > 1) {

            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(input + " is a Palindrome");
        } else {
            System.out.println(input + " is NOT a Palindrome");
        }
    }
}