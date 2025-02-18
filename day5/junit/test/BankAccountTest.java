package src.main.java.org.week4.day5.junit.test;

import src.main.java.org.week4.day5.junit.main.BankAccount;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    private BankAccount account;

    @BeforeEach
    void setUp() {
        account = new BankAccount(500.0);
    }

    @Test
    void testDeposit() {
        account.deposit(200.0);
        assertEquals(700.0, account.getBalance(), "Deposit failed.");
    }

    @Test
    void testWithdraw() {
        account.withdraw(100.0);
        assertEquals(400.0, account.getBalance(), "Withdrawal failed.");
    }

    @Test
    void testWithdrawMoreThanBalance() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> account.withdraw(600.0));
        assertEquals("Insufficient funds.", exception.getMessage());
    }

    @Test
    void testDepositNegativeAmount() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> account.deposit(-50.0));
        assertEquals("Deposit amount must be positive.", exception.getMessage());
    }

    @Test
    void testWithdrawNegativeAmount() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> account.withdraw(-50.0));
        assertEquals("Withdrawal amount must be positive.", exception.getMessage());
    }
}