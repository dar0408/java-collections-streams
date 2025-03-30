import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Dates_Format {
    public static void main(String[] args) {
        // Extract Dates in dd/mm/yyyy Format
        String regex = "\\b\\d{2}/\\d{2}/\\d{4}\\b";

        // Compile the regex pattern
        Pattern pattern = Pattern.compile(regex);

        // Sample dates 
        String[] dates = {"12/05/2023", "15/08/2024", "29/02/2020"};

        // Create a matcher to find valid dates in the text
        for(String date : dates){
            Matcher matcher = pattern.matcher(date);

            // Loop through all matches and print them
             while (matcher.find()) {
                System.out.print(matcher.group() + ", "); // Print only the email addresses
            }
        }
    }
}
