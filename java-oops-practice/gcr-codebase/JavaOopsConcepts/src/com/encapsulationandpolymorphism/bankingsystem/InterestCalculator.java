package com.encapsulationandpolymorphism.bankingsystem;

import java.util.List;

public class InterestCalculator {

    public static void processAccounts(List<BankAccount> accounts) {

        for (BankAccount account : accounts) {

            account.displayAccountDetails();

            double interest = account.calculateInterest();
            System.out.println("Calculated Interest: ₹" + interest);

            if (account instanceof Loanable) {
                boolean eligible = ((Loanable) account).calculateLoanEligibility();
                System.out.println("Loan Eligible: " + (eligible ? "Yes" : "No"));
            }

            System.out.println("----------------------------------");
        }
    }
}
