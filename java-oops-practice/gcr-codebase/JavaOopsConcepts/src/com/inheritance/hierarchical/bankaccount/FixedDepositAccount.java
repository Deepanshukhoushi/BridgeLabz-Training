package com.inheritance.hierarchical.bankaccount;

public class FixedDepositAccount extends BankAccount {

    private int lockInPeriod; // in months

    public FixedDepositAccount(String accountNumber, double balance, int lockInPeriod) {
        super(accountNumber, balance);
        this.lockInPeriod = lockInPeriod;
    }

    public void displayAccountType() {
        System.out.println("Account Type : Fixed Deposit Account");
        System.out.println("Lock-in Period : " + lockInPeriod + " months");
    }
}
