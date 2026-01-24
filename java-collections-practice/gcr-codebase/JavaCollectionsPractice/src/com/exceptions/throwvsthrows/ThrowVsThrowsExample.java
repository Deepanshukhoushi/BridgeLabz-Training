package com.exceptions.throwvsthrows;
import java.util.Scanner;
public class ThrowVsThrowsExample {
    public static double calculateInterest(double amount, double rate, int years)
            throws IllegalArgumentException {
    	 if (amount < 0 || rate < 0) {
            throw new IllegalArgumentException("Amount and rate must be positive");
        }

        return (amount * rate * years) / 100;
    }

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	System.out.println("Enter amount: ");
    	double amount = input.nextDouble();
    	System.out.println("Enter interest rate: ");
    	double rate = input.nextDouble();
    	System.out.println("Enter year: ");
    	int years = input.nextInt();
    
        try {
            double interest = calculateInterest(amount, rate, years);
            System.out.println("Calculated Interest: " + interest);

        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input: Amount and rate must be positive");
        }
        input.close();
    }
}
