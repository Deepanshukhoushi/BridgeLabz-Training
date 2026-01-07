package com.loadbuddy;

public abstract class LoanApplication implements IApprovable {

    protected int termInMonths;
    protected double interestRate;
    protected Applicant applicant;

    private boolean approved; // status controlled internally only

    protected LoanApplication(Applicant applicant, int termInMonths, double interestRate) {
        this.applicant = applicant;
        this.termInMonths = termInMonths;
        this.interestRate = interestRate;
    }

    protected void setApproved(boolean status) {
        this.approved = status;
    }

    public boolean isApproved() {
        return approved;
    }

    protected boolean basicEligibilityCheck() {
        return applicant.getCreditScore() >= 650 && applicant.getIncome() > 20000;
    }
}
