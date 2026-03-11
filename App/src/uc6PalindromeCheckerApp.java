import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class uc6PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "madam";

        char[] charArray = input.toCharArray();

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        for (char c : charArray) {
            queue.add(c);
            stack.push(c);
        }

        boolean isPalindrome = true;

        while (!queue.isEmpty()) {

            if (queue.remove() != stack.pop()) {
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