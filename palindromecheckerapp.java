package PalindromeCheckerApp;

import java.util.Scanner;

public class palindromecheckerapp {
    public static void main(String[]args) {

        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String reversed = "";

        // Reverse the string
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        // Compare original and reversed string
        if (input.equals(reversed)) {
            System.out.println(input + " is a Palindrome.");
        } else {
            System.out.println(input + " is NOT a Palindrome.");
        }

        scanner.close();

    }
}
