import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RepeatingWords {
    public static void main(String[] args) {
       // Regular expression to match repeating words 
       String regex = "\\b(\\w+)\\s+\\1\\b";

        // Compile the regex pattern with case-insensitive flag
        Pattern pattern = Pattern.compile(regex);

        // Sample text
        String text = "This is is a repeated repeated word test.";

        // Create a matcher to find repeating words
        Matcher matcher = pattern.matcher(text);

        // Print extracted repeating words
        while (matcher.find()) {
            System.out.println(matcher.group(1));
        }
    }
}
