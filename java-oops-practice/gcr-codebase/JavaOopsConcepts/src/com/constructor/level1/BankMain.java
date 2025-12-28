package com.constructor.level1;

public class BankMain {

    public static void main(String[] args) {

        BankAccount account =
                new BankAccount(1234567890L,
                                "Rohit Sharma",
                                25000.00);
        account.displayAccountDetails();

        // Modify balance using setter
        account.setBalance(30000.00);
        System.out.println("Updated Balance: ₹" + account.getBalance());
        System.out.println();

        SavingsAccount savings =
                new SavingsAccount(9876543210L,
                                   "Anita Verma",
                                   50000.00,
                                   4.5);
        savings.displaySavingsAccountDetails();
    }
}
