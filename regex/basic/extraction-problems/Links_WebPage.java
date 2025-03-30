import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Links_WebPage {
    public static void main(String[] args) {
       // Extract Links from a Web Page
       String regex = "\\b https?://(www\\.)?([a-zA-Z0-9.-]+)\\.[a-zA-Z]{2,}";

        // Compile the regex pattern
        Pattern pattern = Pattern.compile(regex);

        // Sample text containing URLs
        String text = "Visit https://www.google.com and http://example.org for more info.";

        // Create a matcher to find links in the text
        Matcher matcher = pattern.matcher(text);

        // Loop through all matches and print them
        while (matcher.find()) {
            System.out.print(matcher.group() + ", "); // Print extracted links
        }
    }
}
