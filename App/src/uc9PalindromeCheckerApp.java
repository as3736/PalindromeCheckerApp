public class uc9PalindromeCheckerApp {

    public static boolean checkPalindrome(char[] charArray, int start, int end) {

        if (start >= end) {
            return true;
        }

        if (charArray[start] != charArray[end]) {
            return false;
        }

        return checkPalindrome(charArray, start + 1, end - 1);
    }

    public static void main(String[] args) {

        String input = "madam";

        char[] charArray = input.toCharArray();

        boolean isPalindrome = checkPalindrome(charArray, 0, charArray.length - 1);

        if (isPalindrome) {
            System.out.println(input + " is a Palindrome");
        } else {
            System.out.println(input + " is NOT a Palindrome");
        }
    }
}