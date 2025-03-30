package advanceTesting;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

// JUnit tests for TemperatureConverter
public class TemperatureConverterTest {
    TemperatureConverter converter = new TemperatureConverter();

    @Test
    public void testCelsiusToFahrenheit() {
        assertEquals(32.0, converter.celsiusToFahrenheit(0)); // 0°C = 32°F
    }

    @Test
    public void testFahrenheitToCelsius() {
        assertEquals(0.0, converter.fahrenheitToCelsius(32)); // 32°F = 0°C
    }
}
