package com.loadbuddy;

public class HomeLoan extends LoanApplication {

    public HomeLoan(Applicant applicant, int termInMonths) {
        super(applicant, termInMonths, 0.07);
    }

    @Override
    public boolean approveLoan() {
        boolean eligible = basicEligibilityCheck() && applicant.getLoanAmount() <= applicant.getIncome() * 60;
        setApproved(eligible);
        return eligible;
    }

    @Override
    public double calculateEMI() {
        return calculateStandardEMI();
    }

    protected double calculateStandardEMI() {
        double P = applicant.getLoanAmount();
        double R = interestRate / 12;
        int N = termInMonths;

        return (P * R * Math.pow(1 + R, N)) /
               (Math.pow(1 + R, N) - 1);
    }
}
