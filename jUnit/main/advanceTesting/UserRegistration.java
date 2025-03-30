package advanceTesting;

// Class to handle user registration
public class UserRegistration {

    // Registers a new user and validates inputs
    public void registerUser(String username, String email, String password) {
        if (username == null || username.isEmpty() ||
                email == null || email.isEmpty() ||
                password == null || password.length() < 6) {
            throw new IllegalArgumentException("Invalid input: Check username, email, or password");
        }
    }
}
