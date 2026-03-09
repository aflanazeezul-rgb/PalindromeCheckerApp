import java.util.*;

public class PalindromeCheckerApp {

    public static boolean checkUsingReverse(String input) {
        String s = input.replaceAll("\\s+", "").toLowerCase();
        String reversed = new StringBuilder(s).reverse().toString();
        return s.equals(reversed);
    }

    public static boolean checkUsingStack(String input) {
        String s = input.replaceAll("\\s+", "").toLowerCase();
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            stack.push(c);
        }

        for (char c : s.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkUsingTwoPointers(String input) {
        String s = input.replaceAll("\\s+", "").toLowerCase();
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        long start1 = System.nanoTime();
        boolean result1 = checkUsingReverse(input);
        long end1 = System.nanoTime();

        long start2 = System.nanoTime();
        boolean result2 = checkUsingStack(input);
        long end2 = System.nanoTime();

        long start3 = System.nanoTime();
        boolean result3 = checkUsingTwoPointers(input);
        long end3 = System.nanoTime();

        System.out.println("Reverse Method Result: " + result1 + " Time: " + (end1 - start1) + " ns");
        System.out.println("Stack Method Result: " + result2 + " Time: " + (end2 - start2) + " ns");
        System.out.println("Two Pointer Method Result: " + result3 + " Time: " + (end3 - start3) + " ns");

        scanner.close();
    }
}