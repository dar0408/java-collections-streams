import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Credit_Card {
    public static void main(String[] args) {
        String regex = "^(4[0-9]{15}|5[0-9]{15})$";

        // Compile the regex pattern
        Pattern pattern = Pattern.compile(regex);

        // Sample credit card numbers to test
        String[] cardNumbers = {"4242424242424242", "5105105105105100", "6111111111111111", "4222222222222"};

        // Validate each credit card number
        for(String card : cardNumbers){
            Matcher match = pattern.matcher(card);
             if (match.matches()) {
                System.out.println(card + " is a valid credit card number.");
            } else {
                System.out.println(card + " is an invalid credit card number.");
            }
        }
    }
}
