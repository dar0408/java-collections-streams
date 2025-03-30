package advanceTesting;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

// JUnit test cases for BankAccount class
public class BankAccountTest {
    BankAccount account = new BankAccount(); // Creating a test account

    @Test
    public void testDeposit() {
        account.deposit(100.0);
        assertEquals(100.0, account.getBalance()); // Balance should be updated
    }

    @Test
    public void testWithdrawSuccess() {
        account.deposit(200.0);
        assertTrue(account.withdraw(50.0)); // Should allow withdrawal
        assertEquals(150.0, account.getBalance()); // Balance should be updated
    }

    @Test
    public void testWithdrawFail_InsufficientFunds() {
        assertFalse(account.withdraw(500.0)); // Should fail as balance is low
    }
}
