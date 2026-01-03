package com.managebankcustomers;
import java.util.Scanner;
public class MyBankApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=== Welcome to MyBank ===");

        System.out.print("Enter Account Number: ");
        String accNo = input.nextLine();

        System.out.println("Choose Account Type:");
        System.out.println("1. Savings Account");
        System.out.println("2. Current Account");
        System.out.print("Enter choice: ");
        int choice = input.nextInt();

        System.out.print("Enter Opening Balance: ");
        double openingBalance = input.nextDouble();

        Account account;

        if (choice == 1) {
            account = new SavingsAccount(accNo, openingBalance);
        } else if (choice == 2) {
            account = new CurrentAccount(accNo, openingBalance);
        } else {
            System.out.println("Invalid account type.");
            return;
        }

        account.deposit(2000);
        account.withdraw(500);
        account.calculateInterest();
        account.checkBalance();

        input.close();
    }
}