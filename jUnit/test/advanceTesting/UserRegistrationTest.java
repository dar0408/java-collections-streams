package advanceTesting;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

// JUnit tests for UserRegistration
public class UserRegistrationTest {
    UserRegistration registration = new UserRegistration();

    @Test
    public void testValidUserRegistration() {
        assertDoesNotThrow(() -> registration.registerUser("Alice", "alice@mail.com", "password123"));
    }

    @Test
    public void testInvalidUser_EmptyUsername() {
        assertThrows(IllegalArgumentException.class, () -> registration.registerUser("", "alice@mail.com", "password123"));
    }

    @Test
    public void testInvalidUser_ShortPassword() {
        assertThrows(IllegalArgumentException.class, () -> registration.registerUser("Alice", "alice@mail.com", "123"));
    }
}
