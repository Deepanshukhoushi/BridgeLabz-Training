package com.loadbuddy;

import java.util.Scanner;

public class LoanBuddyApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Credit Score: ");
        int creditScore = sc.nextInt();

        System.out.print("Enter Monthly Income: ");
        double income = sc.nextDouble();

        System.out.print("Enter Loan Amount: ");
        double loanAmount = sc.nextDouble();

        System.out.print("Enter Loan Type (1-Home, 2-Auto): ");
        int loanType = sc.nextInt();

        System.out.print("Enter Loan Term (in months): ");
        int term = sc.nextInt();

        Applicant applicant = new Applicant(name, creditScore, income, loanAmount);

        LoanApplication loan;

        if (loanType == 1) {
            loan = new HomeLoan(applicant, term);
        } else {
            loan = new AutoLoan(applicant, term);
        }

        if (loan.approveLoan()) {
            System.out.println("\n Loan Approved");
            System.out.println("Monthly EMI: " + loan.calculateEMI());
        } else {
            System.out.println("\n Loan Rejected");
        }

        sc.close();
    }
}
