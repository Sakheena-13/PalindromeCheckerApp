public class PalindromeCheckerApp {
    public static void main(String[] args) {
        // UC1: Welcome Message
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 4.0");

        // UC4: Two-Pointer logic implementation
        String input = "radar";
        System.out.println("Input : " + input);

        // Convert the string into a character array.
        char[] chars = input.toCharArray();

        // Initialize pointers
        int start = 0;
        int end = chars.length - 1;

        // Assume palindrome initially.
        boolean isPalindrome = true;

        // Continue comparison until pointers cross.
        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break; // Exit loop early if a mismatch is found
            }
            start++;
            end--;
        }

        System.out.println("Is Palindrome? : " + isPalindrome);
        System.out.println("System initialized successfully..");
    }
}