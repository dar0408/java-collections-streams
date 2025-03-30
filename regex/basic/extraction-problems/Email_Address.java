import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email_Address {
    public static void main(String[] args) {
        // Extract All Email Addresses from a Text
        String regex = "[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z]{2,}";

        // Compile the regex pattern
        Pattern pattern = Pattern.compile(regex);

        // Sample text containing email addresses
        String text = "Contact us at support@example.com and info@company.org";

        // Create a matcher to find email addresses in the text
        Matcher matcher = pattern.matcher(text);

        // Loop through all matches and print them
        while (matcher.find()) {
            System.out.println(matcher.group()); // Print only the email addresses
        }
    }
}
