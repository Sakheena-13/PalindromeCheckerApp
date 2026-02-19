public class PalindromeCheckerApp {
    public static void main(String[] args) {
        // UC1: Welcome Message
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 1.0");

        // UC2: Hardcoded Palindrome Logic
        String input = "madam"; // Hardcoded input
        String reversed = "";

        // Logic to reverse the string
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        // Check if palindrome
        if (input.equals(reversed)) {
            System.out.println("The word '" + input + "' is a Palindrome.");
        } else {
            System.out.println("The word '" + input + "' is NOT a Palindrome.");
        }

        System.out.println("System initialized successfully..");
    }
}