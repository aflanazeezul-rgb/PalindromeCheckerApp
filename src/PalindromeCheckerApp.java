public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Hardcoded input
        String input = "madam";

        // Reverse the string
        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        // Check palindrome
        boolean isPalindrome = input.equals(reversed);

        // Print output in required format
        System.out.println("input text: " + input);
        System.out.println("Is it a palindrome? : " + isPalindrome);
    }
}