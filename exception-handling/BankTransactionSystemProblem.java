import java.util.Scanner;

// Custom Exception for insufficient balance
class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException(String message, double balance){
        super(message); // Call the parent class Exception with the message
    }
}

public class BankTransactionSystemProblem {
    private double balance;

    // Constructor to initialize the account balance
    public BankTransactionSystemProblem(double balance){
        this.balance = balance;
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) throws InsufficientBalanceException{
        if(amount > balance){
            // Throw exception if withdrawal amount exceeds balance
            throw new InsufficientBalanceException("Insufficient balance!", amount);
        } 
        else{
            balance -= amount; // Deduct amount from balance
            System.out.println("Withdrawal successful, new balance: " + balance);
        }
    }

    // Method to deposit money into the account
    public void deposit(double amount) throws IllegalArgumentException{
        if(amount < 0){
            // Throw exception if deposit amount is negative
            throw new IllegalArgumentException("Invalid Amount");
        }
        else{
            balance += amount; // Add amount to balance
            System.out.println("Deposit successful, new balance: " + balance);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a bank account with an initial balance of 100
        BankTransactionSystemProblem bank = new BankTransactionSystemProblem(100);

        try{
            bank.deposit(50); // Deposit 50 to the account
            bank.withdraw(100); // Attempt to withdraw 100
        }
        catch (InsufficientBalanceException e) {
            // Handle insufficient balance exception
            System.out.println(e.getMessage());
        } 
        catch (IllegalArgumentException e) {
            // Handle invalid deposit amount exception
            System.out.println(e.getMessage());
        }
        
        scanner.close(); // Close the scanner to prevent memory leaks
    }
}