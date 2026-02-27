public class PalindromeCheckerApp {

        public static void main(String[] args) {

            // Original String
            String input = "madam";

            // Convert String to Character Array
            char[] characters = input.toCharArray();

            // Two-pointer approach
            int start = 0;
            int end = characters.length - 1;

            boolean isPalindrome = true;

            while (start < end) {

                if (characters[start] != characters[end]) {
                    isPalindrome = false;
                    break;
                }

                start++;
                end--;
            }

            // Display Result
            System.out.println("Input Text : " + input);
            System.out.println("Is it a palindrome? : " + isPalindrome);
        }

}