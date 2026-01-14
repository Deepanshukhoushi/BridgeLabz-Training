package com.budgetwise;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Budget implements IAnalyzable {
    protected double income;
    protected double limit;
    protected Map<String, Double> categoryLimits;
    protected List<Transaction> transactions;

    protected Budget(double income, double limit) {
        this.income = income;
        this.limit = limit;
        this.categoryLimits = new HashMap<>();
        this.transactions = new ArrayList<>();
    }


    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    protected double getTotalExpenses() {
        double total = 0;
        for (Transaction t : transactions) {
            if (t.getType().equalsIgnoreCase("EXPENSE")) {
                total += t.getAmount();
            }
        }
        return total;
    }

    public double calculateSavings() {
        return income - getTotalExpenses();
    }
}

