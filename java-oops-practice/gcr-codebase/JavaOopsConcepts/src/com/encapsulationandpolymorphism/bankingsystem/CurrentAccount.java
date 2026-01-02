package com.encapsulationandpolymorphism.bankingsystem;

public class CurrentAccount extends BankAccount implements Loanable {

    private static final double INTEREST_RATE = 0.01; // 1%

    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return balance * INTEREST_RATE;
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Current Account Business Loan Applied: ₹" + amount);
    }

    @Override
    public boolean calculateLoanEligibility() {
        return balance >= 100000;
    }
}
