package com.loadbuddy;

public class AutoLoan extends LoanApplication {

    public AutoLoan(Applicant applicant, int termInMonths) {
        super(applicant, termInMonths, 0.09);
    }

    @Override
    public boolean approveLoan() {
        boolean eligible = basicEligibilityCheck() && applicant.getLoanAmount() <= applicant.getIncome() * 30;
        setApproved(eligible);
        return eligible;
    }

    @Override
    public double calculateEMI() {
        double P = applicant.getLoanAmount();
        double R = interestRate / 12;
        int N = termInMonths;

        return (P * R * Math.pow(1 + R, N)) /
               (Math.pow(1 + R, N) - 1);
    }
}
