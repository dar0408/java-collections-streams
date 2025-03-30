package advanceTesting;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

// Class to format dates
public class DateFormatter {

    // Converts "yyyy-MM-dd" format to "dd-MM-yyyy"
    public String formatDate(String inputDate) throws ParseException {
        SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat outputFormat = new SimpleDateFormat("dd-MM-yyyy");

        Date date = inputFormat.parse(inputDate); // Parsing the input date
        return outputFormat.format(date); // Formatting it into the new format
    }
}

