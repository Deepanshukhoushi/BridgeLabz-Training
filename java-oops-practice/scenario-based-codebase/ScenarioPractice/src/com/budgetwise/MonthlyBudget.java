package com.budgetwise;
public class MonthlyBudget extends Budget {
    public MonthlyBudget(double income, double limit) {
        super(income, limit);
    }

    public void addCategoryLimit(String category, double amount) {
        categoryLimits.put(category, amount);
    }

    @Override
    public void generateReport() {
        System.out.println("\nMonthly Budget Report");
        System.out.println("Income: " + income);
        System.out.println("Expenses: " + getTotalExpenses());
        System.out.println("Savings: " + calculateSavings());
    }

    @Override
    public void detectOverspend() {
        if (getTotalExpenses() > limit) {
            System.out.println("Monthly budget limit exceeded!");
        } else {
            System.out.println("Spending within monthly limit");
        }
    }
}
