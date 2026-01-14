package com.budgetwise;
import java.time.LocalDate;
import java.util.Scanner;

public class BudgetWiseApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Budget budget;

        System.out.println("Welcome to BudgetWise");
        System.out.println("1. Monthly Budget");
        System.out.println("2. Annual Budget");
        System.out.print("Choose budget type: ");
        int choice = scanner.nextInt();

        System.out.print("Enter income: ");
        double income = scanner.nextDouble();

        System.out.print("Enter spending limit: ");
        double limit = scanner.nextDouble();

        if (choice == 1) {
            budget = new MonthlyBudget(income, limit);
        } else {
            budget = new AnnualBudget(income, limit);
        }

        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Add Expense");
            System.out.println("2. Generate Report");
            System.out.println("3. Check Overspending");
            System.out.println("4. Exit");

            int option = scanner.nextInt();

            switch (option) {
                case 1 -> {
                    System.out.print("Enter amount: ");
                    double amount = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.print("Enter category: ");
                    String category = scanner.nextLine();

                    Transaction t = new Transaction(
                            amount,
                            "EXPENSE",
                            LocalDate.now(),
                            category
                    );
                    budget.addTransaction(t);
                    System.out.println("Expense added successfully");
                }
                case 2 -> budget.generateReport();
                case 3 -> budget.detectOverspend();
                case 4 -> {
                    System.out.println("Thank you for using BudgetWise!");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Invalid choice");
            }
        }
    }
}
