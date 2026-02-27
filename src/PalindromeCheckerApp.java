
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Original String
        String input = "civic";

        // Create Stack (LIFO)
        Stack<Character> stack = new Stack<>();

        // Create Queue (FIFO)
        Queue<Character> queue = new LinkedList<>();

        // Push into stack & Enqueue into queue
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            stack.push(ch);      // LIFO
            queue.add(ch);       // FIFO
        }

        boolean isPalindrome = true;

        // Compare pop (stack) with dequeue (queue)
        while (!stack.isEmpty()) {

            char fromStack = stack.pop();     // LIFO removal
            char fromQueue = queue.remove();  // FIFO removal

            if (fromStack != fromQueue) {
                isPalindrome = false;
                break;
            }
        }

        // Display Result
        System.out.println("Input Text : " + input);
        System.out.println("Is it a palindrome? : " + isPalindrome);
    }
}