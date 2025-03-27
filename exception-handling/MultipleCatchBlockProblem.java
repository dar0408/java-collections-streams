import java.util.Scanner;

public class MultipleCatchBlockProblem {
    public static void main(String[] args) {
        // Creating a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Initializing an array of integers
        Integer numbers[] = {1, 2, 3, 4, 5};

        try {
            // Prompting the user to enter an index
            System.out.println("Enter index: ");
            int index = scanner.nextInt(); // Reading user input

            // Accessing the value at the given index
            System.out.println("Value at index " + index + " : " + numbers[index]);
        } 
        // enters an index out of bounds
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Index");
        } 
        // the array is null (not initialized)
        catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        } 
        finally {
            // Ensuring scanner is closed to prevent resource leaks
            scanner.close();
            System.out.println("Operation completed.");
        }
    }
}
