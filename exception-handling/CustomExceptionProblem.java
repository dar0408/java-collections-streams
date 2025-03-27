import java.lang.reflect.Method;

// Custom exception class for invalid age
class InvalidAgeException extends Exception{
     // Constructor that takes a message and passes it to the Exception class
    public InvalidAgeException(String message){
        super(message);
    }
}

public class CustomExceptionProblem {
    // Method to validate age, throws InvalidAgeException if age is below 18
    public void validateAge(int age) throws InvalidAgeException{
        if(age < 18){
            // Throwing custom exception when age is invalid
            throw new InvalidAgeException("Age must be 18 or above");
        }
        else{
            System.out.println("Access granted!");
        }
    }
    public static void main(String[] args) {
        // Creating an instance of CustomExceptionProblem
        CustomExceptionProblem custom = new CustomExceptionProblem();

        try{
        // Attempting to validate an age that is below 18 (which will cause an exception)
            custom.validateAge(15);
        }
        catch(InvalidAgeException e){
             // Handling the thrown exception and displaying the error message
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
