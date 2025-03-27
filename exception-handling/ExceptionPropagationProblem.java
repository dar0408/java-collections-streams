public class ExceptionPropagationProblem {
     // Method to calculate interest, throws IllegalArgumentException for invalid inputs
    public double calculateInterest(double amount, double rate, int years) throws IllegalArgumentException{
        if(amount < 0 || rate < 0){
            throw new IllegalArgumentException("Amount and rate must be positive");
        }
        
        return (amount * rate * years) / 100; // Simple interest formula
    }
    public static void main(String[] args) {
        ExceptionPropagationProblem exceptions = new ExceptionPropagationProblem();

        try{
            // Valid input case
           double interest = exceptions.calculateInterest(10000, 5, 2);
           System.out.println("Calculated Interest: " + interest);

            // Invalid input case (negative amount)
            double invalidInterest = exceptions.calculateInterest(-5000, 5, 2);
            System.out.println("Calculated Interest: " + invalidInterest);
        }
        catch(IllegalArgumentException e){
            System.out.println("Invalid input: " + e.getMessage());
        }
    }
}
