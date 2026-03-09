package PalindromeCheckerApp;

import java.util.Scanner;

/**
 * =========================================================
 * MAIN CLASS - UseCase9RecursivePalindrome
 * =========================================================
 *
 * Use Case 9: Recursive Palindrome Checker
 *
 * Description:
 * This class validates a palindrome using recursion.
 *
 * Characters are compared from the outer positions
 * moving inward using recursive calls.
 *
 * The recursion stops when:
 * - All characters are matched, or
 * - A mismatch is found.
 *
 * This use case demonstrates divide-and-conquer
 * logic using method recursion.
 *
 * @author Rupa
 * @version 9.0
 */
public class palindromecheckerapp {

    /**
     * Application entry point for UC9.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Call recursive method with start and end index
        boolean isPalindrome = check(input, 0, input.length() - 1);

        // Display result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);

        scanner.close();
    }

    /**
     * Recursively checks whether a string is palindrome.
     *
     * @param s     Input string
     * @param start Starting index
     * @param end   Ending index
     * @return true if palindrome, otherwise false
     */
    private static boolean check(String s, int start, int end) {

        if (start >= end) {
            return true;
        }

        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }
        return check(s, start + 1, end - 1);
    }
}