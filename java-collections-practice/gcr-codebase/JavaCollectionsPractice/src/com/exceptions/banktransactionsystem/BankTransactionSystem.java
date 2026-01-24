package com.exceptions.banktransactionsystem;

import java.util.Scanner;

public class BankTransactionSystem {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        BankAccount account = new BankAccount(5000);
        double amount = 5000;
        while(amount>0) {
	        try {
	            System.out.print("Enter withdrawal amount: ");
	            amount = scanner.nextDouble();
	
	            account.withdraw(amount);
	
	        } catch (InsufficientBalanceException e) {
	            System.out.println(e.getMessage());
	
	        } catch (IllegalArgumentException e) {
	            System.out.println(e.getMessage());
	        }
        }
    }
}
