package basicTesting;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

// Testing class for StringUtils
public class StringUtilsTest {
    StringUtils utils = new StringUtils(); // Creating an instance of StringUtils

    @Test
    public void testReverse() {
        assertEquals("olleH", utils.reverse("Hello")); // "Hello" reversed should be "olleH"
    }

    @Test
    public void testIsPalindrome() {
        assertTrue(utils.isPalindrome("madam")); // "madam" is a palindrome
        assertFalse(utils.isPalindrome("hello")); // "hello" is NOT a palindrome
    }

    @Test
    public void testToUpperCase() {
        assertEquals("HELLO", utils.toUpperCase("hello")); // Converts to uppercase
    }
}
