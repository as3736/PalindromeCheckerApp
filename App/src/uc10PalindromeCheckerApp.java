public class uc10PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "A man a plan a canal Panama";

        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        char[] charArray = normalized.toCharArray();

        int start = 0;
        int end = charArray.length - 1;

        boolean isPalindrome = true;

        while (start < end) {

            if (charArray[start] != charArray[end]) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println(input + " is a Palindrome (ignoring spaces and case)");
        } else {
            System.out.println(input + " is NOT a Palindrome");
        }
    }
}