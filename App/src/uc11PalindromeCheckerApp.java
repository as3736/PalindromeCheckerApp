class PalindromeChecker {

    public boolean checkPalindrome(String input) {

        char[] charArray = input.toCharArray();

        int start = 0;
        int end = charArray.length - 1;

        while (start < end) {

            if (charArray[start] != charArray[end]) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}

public class uc11PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "madam";

        PalindromeChecker checker = new PalindromeChecker();

        boolean isPalindrome = checker.checkPalindrome(input);

        if (isPalindrome) {
            System.out.println(input + " is a Palindrome");
        } else {
            System.out.println(input + " is NOT a Palindrome");
        }
    }
}