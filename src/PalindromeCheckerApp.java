
public class PalindromeCheckerApp {

    // Recursive Method
    public static boolean isPalindrome(String input, int start, int end) {

        // Base Condition: If pointers cross or meet
        if (start >= end) {
            return true;
        }

        // If characters do not match
        if (input.charAt(start) != input.charAt(end)) {
            return false;
        }

        // Recursive Call (Move inward)
        return isPalindrome(input, start + 1, end - 1);
    }

    public static void main(String[] args) {

        String input = "madam";

        boolean result = isPalindrome(input, 0, input.length() - 1);

        System.out.println("Input Text : " + input);
        System.out.println("Is it a palindrome? : " + result);
    }
}