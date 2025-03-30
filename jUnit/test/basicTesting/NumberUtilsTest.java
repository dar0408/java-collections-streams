package basicTesting;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

// Testing class for NumberUtils
public class NumberUtilsTest {
    NumberUtils numberUtils = new NumberUtils(); // Creating an instance of NumberUtils

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 8, 10}) // Testing multiple even numbers
    public void testIsEven_TrueCases(int number) {
        assertTrue(numberUtils.isEven(number)); // Should return true
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, 7, 9}) // Testing multiple odd numbers
    public void testIsEven_FalseCases(int number) {
        assertFalse(numberUtils.isEven(number)); // Should return false
    }
}
