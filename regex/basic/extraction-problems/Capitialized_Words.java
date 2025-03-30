import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Capitialized_Words {
    public static void main(String[] args) {
        // Extract All Capitalized Words from a Sentence
        String regex = "\\b[A-Z][a-z]*\\b";

        // Compile the regex pattern
        Pattern pattern = Pattern.compile(regex);

        // Sample text 
        String text = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";

        // Create a matcher to find  Extract All Capitalized Words from a Sentence
        Matcher matcher = pattern.matcher(text);

        // Loop through all matches and print them
        while (matcher.find()) {
            System.out.print(matcher.group() + ", "); 
        }
    }
}
