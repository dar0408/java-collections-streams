import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SocietySecurityNumber {
    public static void main(String[] args) {
        // Regular expression for a valid SSN (format: XXX-XX-XXXX)
        String regex = "^\\d{3}-\\d{2}-\\d{4}$";

        // Compile the regex pattern
        Pattern pattern = Pattern.compile(regex);

        // Sample SSNs to test
        String[] ssnNumbers = {"123-45-6789", "123456789", "987-65-4321", "12-345-6789"};

        for(String ssn : ssnNumbers){
            Matcher match = pattern.matcher(ssn);
            if(match.matches()){
                System.out.println(ssn + " is a valid SSN.");
            } 
            else {
                System.out.println(ssn + " is an invalid SSN.");
            }
        }
    }
}
