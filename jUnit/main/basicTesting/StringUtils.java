package basicTesting;
// Utility class for common string operations
public class StringUtils {

    // Reverses a string (e.g., "hello" -> "olleh")
    public String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    // Checks if a string is a palindrome (e.g., "madam" -> true)
    public boolean isPalindrome(String str) {
        return str.equalsIgnoreCase(reverse(str)); // Ignores case differences
    }

    // Converts a string to uppercase (e.g., "hello" -> "HELLO")
    public String toUpperCase(String str) {
        return str.toUpperCase();
    }
}
