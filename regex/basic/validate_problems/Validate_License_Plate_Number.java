import java.util.regex.Pattern;

public class Validate_License_Plate_Number {
    public static void main(String[] args) {
        // License plate format: Starts with two uppercase letters, followed by four digits.
        String regex = "^[A-Z]{2}\\d{4}$";

        // Compile the regex pattern
        Pattern pattern = Pattern.compile(regex);

        // Array of sample license plate Numbers to test
        String[] licenseNumbers = {"AB1234", "A12345"};

        // Loop through each license plate Numbers and validate it against the pattern
          for(String licenseNumber : licenseNumbers){
            System.out.println(licenseNumber + " " + pattern.matcher(licenseNumber).matches());
        }
    }
}
