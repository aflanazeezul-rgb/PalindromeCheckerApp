public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Original String
        String input = "madam";

        // Variable to store reversed string
        String reversed = "";

        // Reverse using for loop
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        // Compare original and reversed string
        boolean isPalindrome = input.equals(reversed);

        // Display result
        System.out.println("Original String  : " + input);
        System.out.println("Reversed String  : " + reversed);
        System.out.println("Is it a palindrome? : " + isPalindrome);
    }
}