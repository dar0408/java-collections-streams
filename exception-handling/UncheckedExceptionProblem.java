import java.util.InputMismatchException;
import java.util.Scanner;

public class UncheckedExceptionProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
            // Take numerator as input from user
            System.out.println("Enter numerator: ");
            int numerator = scanner.nextInt();

            // Take denominator as input from user
            System.out.println("Enter denominator: ");
            int denominator = scanner.nextInt();

            // Perform division
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception Occurred: " + e.getMessage());
        }
        catch(InputMismatchException e){
            System.out.println("Input MismatchException Occurred: " + e.getMessage());
        }
    }
}
