import java.util.Scanner;

public class NestedTryCatchBlockProblem {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Sample Array
        Integer number[] = {1, 2, 3, 4, 5};

        // Take index as input from user
        System.out.print("Enter index: ");
        int index = scanner.nextInt();
        
        // Take divisor as input from user
        System.out.print("Enter divisor: ");
        int divisor = scanner.nextInt();

        try{
            // Attempt to divide the element
            int result = number[index] / divisor;
            System.out.println("Result: " + result);
        }
        catch(ArrayIndexOutOfBoundsException  e){
            System.out.println("Invalid array index!");
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide by zero!");
        }

        scanner.close();
   } 
}
