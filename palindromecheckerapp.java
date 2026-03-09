package PalindromeCheckerApp;

import java.util.Scanner;

/**
 * =========================================================
 * MAIN CLASS - UseCase12PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 12: Strategy Pattern for Palindrome Algorithms
 *
 * Description:
 * This class demonstrates how different palindrome
 * validation algorithms can be selected dynamically
 * at runtime using the Strategy Design Pattern.
 *
 * At this stage, the application:
 * - Defines a common PalindromeStrategy interface
 * - Implements a concrete Stack based strategy
 * - Injects the strategy at runtime
 * - Executes the selected algorithm
 *
 * @author Rupa
 * @version 12.0
 */
public class palindromecheckerapp {

    /**
     * Application entry point for UC12.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Inject StackStrategy at runtime
        PalindromeStrategy strategy = new StackStrategy();
        boolean isPalindrome = strategy.check(input);

        System.out.println("Input : " + input);
        System.out.println("Strategy used : Stack");
        System.out.println("Is Palindrome? : " + isPalindrome);

        // Inject DequeStrategy at runtime
        strategy = new DequeStrategy();
        isPalindrome = strategy.check(input);

        System.out.println("\nStrategy used : Deque");
        System.out.println("Is Palindrome? : " + isPalindrome);

        scanner.close();
    }
}

/**
 * =========================================================
 * INTERFACE - PalindromeStrategy
 * =========================================================
 *
 * This interface defines a contract for all
 * palindrome checking algorithms.
 *
 * Any new algorithm must implement this interface
 * and provide its own validation logic.
 */
interface PalindromeStrategy {
    boolean check(String input);
}

/**
 * =========================================================
 * CLASS - StackStrategy
 * =========================================================
 *
 * This class provides a Stack based implementation
 * of the PalindromeStrategy interface.
 *
 * It uses LIFO behavior to reverse characters
 * and compare them with the original sequence.
 */
class StackStrategy implements PalindromeStrategy {

    /**
     * Implements palindrome validation using Stack.
     *
     * @param input String to validate
     * @return true if palindrome, false otherwise
     */
    public boolean check(String input) {

        java.util.Stack<Character> stack = new java.util.Stack<>();
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}

/**
 * =========================================================
 * CLASS - DequeStrategy
 * =========================================================
 *
 * This class provides a Deque based implementation
 * of the PalindromeStrategy interface.
 *
 * It uses front and rear access to compare
 * characters from both ends.
 */
class DequeStrategy implements PalindromeStrategy {

    /**
     * Implements palindrome validation using Deque.
     *
     * @param input String to validate
     * @return true if palindrome, false otherwise
     */
    public boolean check(String input) {

        java.util.ArrayDeque<Character> deque = new java.util.ArrayDeque<>();

        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }
        return true;
    }
}