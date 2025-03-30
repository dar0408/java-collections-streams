package basicTesting;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

// Test for exception handling in division
public class MathOperationsTest {
    MathOperations math = new MathOperations();

    @Test
    public void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> math.divide(5, 0)); // Expect an exception
    }
}
