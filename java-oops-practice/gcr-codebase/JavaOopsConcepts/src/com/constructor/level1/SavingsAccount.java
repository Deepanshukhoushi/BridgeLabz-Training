package com.constructor.level1;

public class SavingsAccount extends BankAccount {

    private double interestRate;

    public SavingsAccount(long accountNumber,
                          String accountHolder,
                          double balance,
                          double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    // Accessing public & protected members
    public void displaySavingsAccountDetails() {
        System.out.println("Account Number : " + accountNumber);   // public
        System.out.println("Account Holder : " + accountHolder);   // protected
        System.out.println("Balance        : ₹" + getBalance());
        System.out.println("Interest Rate  : " + interestRate + "%");
        System.out.println();
    }
}
