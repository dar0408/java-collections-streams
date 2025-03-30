import java.util.regex.Pattern;

public class Validate_Hex_Color_Code {
    public static void main(String[] args) {
        //A valid hex color:
        //Starts with a #   
        //Followed by 6 hexadecimal characters (0-9, A-F, a-f).
        String regex = "^#([0-9A-Fa-f]{6})";

        
        // Compile the regex pattern
        Pattern pattern = Pattern.compile(regex);

        // Array of sample hex color code to test
        String[] colorCode = {"#FFA500", "#ff4500", "#123"};

        // Loop through each hex color code and validate it against the pattern
          for(String colorCodes : colorCode){
            System.out.println(colorCodes + " " + pattern.matcher(colorCodes).matches());
        }
    }
}
