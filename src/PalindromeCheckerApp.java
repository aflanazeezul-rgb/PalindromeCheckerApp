
import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Original String
        String input = "noon";

        // Create Stack
        Stack<Character> stack = new Stack<>();

        // Push all characters into stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        // Compare by popping from stack
        boolean isPalindrome = true;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        // Display Result
        System.out.println("Input Text : " + input);
        System.out.println("Is it a palindrome? : " + isPalindrome);
    }
}