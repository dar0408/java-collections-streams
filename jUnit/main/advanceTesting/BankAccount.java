package advanceTesting;

// Simple BankAccount class that allows deposits, withdrawals, and balance checks
public class BankAccount {
    private double balance; // Stores the current account balance

    // Deposits money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount; // Adds amount to balance
        }
    }

    // Withdraws money if sufficient balance is available
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount; // Deducts the amount
            return true;
        }
        return false; // Withdrawal fails if balance is insufficient
    }

    // Returns the current balance
    public double getBalance() {
        return balance;
    }
}
