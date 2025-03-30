import java.util.regex.*;

class IPAdress{
    public static void main(String[] args) {
        // A valid IPv4 address consists of four groups of numbers (0-255) separated by dots.
        String regex = "^(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)\\.(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)\\.(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)\\.(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)$";

        // Compile the regex pattern
        Pattern pattern = Pattern.compile(regex);

        // Sample IP addresses to test
        String[] ipAddresses = {"192.168.1.1", "255.255.255.255", "256.100.50.25", "0.0.0.0", "123.456.78.90"};
 
        // Validate each IP address
        for (String ip : ipAddresses) {
            Matcher matcher = pattern.matcher(ip);
            System.out.println(ip + " is valid: " + matcher.matches());
         }
    }
}