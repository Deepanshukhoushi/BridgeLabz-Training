package com.regexandjunit.junit.banktransations;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BankAccountTest {

    private BankAccount account;

    @BeforeEach
    void setUp() {
        account = new BankAccount(1000.0);
    }

    @Test
    void testDepositIncreasesBalance() {
        account.deposit(500.0);
        assertEquals(1500.0, account.getBalance());
    }

    @Test
    void testWithdrawDecreasesBalance() {
        account.withdraw(300.0);
        assertEquals(700.0, account.getBalance());
    }

    @Test
    void testWithdrawWithInsufficientFundsThrowsException() {
        IllegalStateException exception = assertThrows(
                IllegalStateException.class,
                () -> account.withdraw(1500.0)
        );

        assertEquals("Insufficient funds", exception.getMessage());
        assertEquals(1000.0, account.getBalance()); // balance unchanged
    }
}
