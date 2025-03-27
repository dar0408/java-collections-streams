import java.util.Scanner;

public class FinallyBlockExceutionProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
            // Taking two integers from the user
            System.out.println("Enter numerator: ");
            int numerator = scanner.nextInt();

            System.out.println("Enter denominator: ");
            int denominator = scanner.nextInt();

            // Performing division
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception Caught: " + e.getMessage());
        }
        finally{
            scanner.close();
            // This block executes no matter what
            System.out.println("Operation Completed");
        }
    }
}
