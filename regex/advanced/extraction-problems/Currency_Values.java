import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Currency_Values {
    public static void main(String[] args) {
        // Regular expression to match currency values:
        // \$?      -> Matches an optional dollar sign ($)
        // \d+      -> Matches one or more digits (whole number part)
        // (\.\d{2})? -> Matches an optional decimal point followed by exactly two digits (cents part)
        String regex = "\\$?\\d+(\\.\\d{2})";

        // Compile the regex pattern
        Pattern pattern = Pattern.compile(regex);

        // Sample text
        String text = "The price is $45.99, and the discount is 10.50.";

        // Create a matcher to find currency values
        Matcher matcher = pattern.matcher(text);

        // Print extracted currency values
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
