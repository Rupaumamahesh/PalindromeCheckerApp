package PalindromeCheckerApp;

import java.util.Scanner;
import java.util.Stack;
import java.util.ArrayDeque;
import java.util.LinkedList;

/**
 * =========================================================
 * MAIN CLASS - UseCase13PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 13: Performance Comparison
 *
 * Description:
 * This class compares the performance of different
 * palindrome validation algorithms by measuring
 * execution time using System.nanoTime().
 *
 * Algorithms compared:
 * - Character Array (Two Pointer)
 * - Stack
 * - Deque
 * - LinkedList
 * - Recursion
 *
 * @author Rupa
 * @version 13.0
 */
public class palindromecheckerapp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.println("\n--- Performance Comparison ---\n");

        // ---- Algorithm 1: Character Array (Two Pointer) ----
        long start1 = System.nanoTime();
        boolean result1 = checkCharArray(input);
        long end1 = System.nanoTime();
        System.out.println("Character Array : Is Palindrome? " + result1);
        System.out.println("Time taken : " + (end1 - start1) + " ns\n");

        // ---- Algorithm 2: Stack ----
        long start2 = System.nanoTime();
        boolean result2 = checkStack(input);
        long end2 = System.nanoTime();
        System.out.println("Stack           : Is Palindrome? " + result2);
        System.out.println("Time taken : " + (end2 - start2) + " ns\n");

        // ---- Algorithm 3: Deque ----
        long start3 = System.nanoTime();
        boolean result3 = checkDeque(input);
        long end3 = System.nanoTime();
        System.out.println("Deque           : Is Palindrome? " + result3);
        System.out.println("Time taken : " + (end3 - start3) + " ns\n");

        // ---- Algorithm 4: LinkedList ----
        long start4 = System.nanoTime();
        boolean result4 = checkLinkedList(input);
        long end4 = System.nanoTime();
        System.out.println("LinkedList      : Is Palindrome? " + result4);
        System.out.println("Time taken : " + (end4 - start4) + " ns\n");

        // ---- Algorithm 5: Recursion ----
        long start5 = System.nanoTime();
        boolean result5 = checkRecursion(input, 0, input.length() - 1);
        long end5 = System.nanoTime();
        System.out.println("Recursion       : Is Palindrome? " + result5);
        System.out.println("Time taken : " + (end5 - start5) + " ns\n");

        scanner.close();
    }

    // Character Array - Two Pointer
    private static boolean checkCharArray(String input) {
        char[] chars = input.toCharArray();
        int start = 0;
        int end = chars.length - 1;
        while (start < end) {
            if (chars[start] != chars[end]) return false;
            start++;
            end--;
        }
        return true;
    }

    // Stack
    private static boolean checkStack(String input) {
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) stack.push(c);
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) return false;
        }
        return true;
    }

    // Deque
    private static boolean checkDeque(String input) {
        ArrayDeque<Character> deque = new ArrayDeque<>();
        for (char c : input.toCharArray()) deque.addLast(c);
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) return false;
        }
        return true;
    }

    // LinkedList
    private static boolean checkLinkedList(String input) {
        LinkedList<Character> list = new LinkedList<>();
        for (char c : input.toCharArray()) list.add(c);
        while (list.size() > 1) {
            if (list.removeFirst() != list.removeLast()) return false;
        }
        return true;
    }

    // Recursion
    private static boolean checkRecursion(String s, int start, int end) {
        if (start >= end) return true;
        if (s.charAt(start) != s.charAt(end)) return false;
        return checkRecursion(s, start + 1, end - 1);
    }
}