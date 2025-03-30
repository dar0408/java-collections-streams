package advanceTesting;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.text.ParseException;

// JUnit tests for DateFormatter
public class DateFormatterTest {
    DateFormatter formatter = new DateFormatter();

    @Test
    public void testValidDateFormat() throws ParseException {
        assertEquals("15-03-2025", formatter.formatDate("2025-03-15"));
    }

    @Test
    public void testInvalidDateFormat() {
        assertThrows(ParseException.class, () -> formatter.formatDate("15-03-2025")); // Invalid format
    }
}
