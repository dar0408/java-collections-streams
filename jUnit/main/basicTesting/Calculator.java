package basicTesting;
// A simple Calculator class with basic arithmetic operations.
public class Calculator {

    // Adds two numbers
    public int add(int a, int b) {
        return a + b;
    }

    // Subtracts the second number from the first
    public int subtract(int a, int b) {
        return a - b;
    }

    // Multiplies two numbers
    public int multiply(int a, int b) {
        return a * b;
    }

    // Divides the first number by the second (handles division by zero)
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero"); // Prevents division by zero
        }
        return a / b;
    }
}
