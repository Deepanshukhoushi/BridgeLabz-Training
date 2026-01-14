package com.budgetwise;
public class AnnualBudget extends Budget {
    public AnnualBudget(double income, double limit) {
        super(income, limit);
    }

    @Override
    public void generateReport() {
        System.out.println("\nAnnual Budget Summary");
        System.out.println("Annual Income: " + income);
        System.out.println("Annual Expenses: " + getTotalExpenses());
        System.out.println("Annual Savings: " + calculateSavings());
    }

    @Override
    public void detectOverspend() {
        if (getTotalExpenses() > limit) {
            System.out.println("Annual budget exceeded!");
        } else {
            System.out.println("Spending under annual control");
        }
    }
}
