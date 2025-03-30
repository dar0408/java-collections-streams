import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Programming_Language_Names{
    public static void main(String[] args) {
        // Regular expression to match programming language names
        String regex = "\\b(JavaScript|Java|Python|C\\+\\+|C#|Go|Ruby|Swift|PHP|Kotlin)\\b";

        // Compile the regex pattern
        Pattern pattern = Pattern.compile(regex);

        // Sample text
        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";

         // Create a matcher to find programming language names
        Matcher matcher = pattern.matcher(text);

        // Print extracted programming language names
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}