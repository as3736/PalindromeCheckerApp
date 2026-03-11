import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class uc13PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "madam";

        char[] charArray = input.toCharArray();

        // Stack Algorithm
        long startTime1 = System.nanoTime();

        Stack<Character> stack = new Stack<>();

        for (char c : charArray) {
            stack.push(c);
        }

        boolean isPalindromeStack = true;

        for (char c : charArray) {

            if (c != stack.pop()) {
                isPalindromeStack = false;
                break;
            }
        }

        long endTime1 = System.nanoTime();

        // Deque Algorithm
        long startTime2 = System.nanoTime();

        Deque<Character> deque = new ArrayDeque<>();

        for (char c : charArray) {
            deque.addLast(c);
        }

        boolean isPalindromeDeque = true;

        while (deque.size() > 1) {

            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
                isPalindromeDeque = false;
                break;
            }
        }

        long endTime2 = System.nanoTime();

        System.out.println("Stack Result: " + isPalindromeStack);
        System.out.println("Stack Execution Time: " + (endTime1 - startTime1) + " ns");

        System.out.println("Deque Result: " + isPalindromeDeque);
        System.out.println("Deque Execution Time: " + (endTime2 - startTime2) + " ns");
    }
}
