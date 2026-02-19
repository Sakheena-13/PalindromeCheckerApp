public class PalindromeCheckerApp {
    public static void main(String[] args) {
        // UC1: Welcome Message
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 3.0");

        String input = "madam"; // You can change this value to test
        String reversed = "";

        // UC3: Reverse transformation logic using the provided hint
        // Iterate from the last character to the first.
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        // Compare original and reversed strings
        if (input.equalsIgnoreCase(reversed)) {
            System.out.println("Result: The string '" + input + "' is a palindrome.");
        } else {
            System.out.println("Result: The string '" + input + "' is NOT a palindrome.");
        }

        System.out.println("System initialized successfully..");
    }
}