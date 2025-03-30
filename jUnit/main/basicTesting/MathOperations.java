package basicTesting;
// Class with a division method that handles division by zero
public class MathOperations {

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}
