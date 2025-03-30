import java.util.regex.*;

class Validate_UserName{
    public static void main(String[] args) {
        // valid username:
        // Can only contain letters (a-z, A-Z), numbers (0-9), and underscores (_)
        // Must start with a letter
        // Must be between 5 to 15 characters long

        String regex = "^[a-zA-Z][a-zA-Z0-9_]{4,14}$";

        // Compile the regex pattern
        Pattern pattern = Pattern.compile(regex);

        // Array of sample usernames to test
        String[] userNames = {"user_123", "123user", "us"};

         // Loop through each username and validate it against the pattern
        for(String userName : userNames){
            System.out.println(userName + " " + pattern.matcher(userName).matches());
        }
    }
}