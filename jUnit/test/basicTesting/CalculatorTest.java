package basicTesting;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

// Testing class for the Calculator
public class CalculatorTest {
    Calculator calculator = new Calculator(); // Creating an instance of Calculator

    @Test
    public void testAddition() {
        assertEquals(5, calculator.add(2, 3)); // 2 + 3 should be 5
    }

    @Test
    public void testSubtraction() {
        assertEquals(1, calculator.subtract(5, 4)); // 5 - 4 should be 1
    }

    @Test
    public void testMultiplication() {
        assertEquals(6, calculator.multiply(2, 3)); // 2 * 3 should be 6
    }

    @Test
    public void testDivision() {
        assertEquals(2, calculator.divide(6, 3)); // 6 / 3 should be 2
    }

    @Test
    public void testDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(5, 0)); // Should throw an exception
    }
}
