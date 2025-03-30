package advanceTesting;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

// JUnit tests for PasswordValidator class
public class PasswordValidatorTest {
    PasswordValidator validator = new PasswordValidator(); // Creating an instance

    @Test
    public void testValidPassword() {
        assertTrue(validator.isValid("StrongP@ss1")); // Should be valid
    }

    @Test
    public void testInvalidPassword_TooShort() {
        assertFalse(validator.isValid("Weak1")); // Should fail due to short length
    }

    @Test
    public void testInvalidPassword_NoUppercase() {
        assertFalse(validator.isValid("lowercase1")); // No uppercase letter
    }

    @Test
    public void testInvalidPassword_NoDigit() {
        assertFalse(validator.isValid("NoDigitsHere")); // No digit present
    }
}
