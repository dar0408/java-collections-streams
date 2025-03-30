package advanceTesting;

// Class to validate password strength
public class PasswordValidator {

    // Checks if the password meets the strength criteria
    public boolean isValid(String password) {
        return password.length() >= 8 &&
                password.matches(".*[A-Z].*") &&  // At least one uppercase letter
                password.matches(".*\\d.*");     // At least one digit
    }
}
