package com.budgetwise;
import java.time.LocalDate;
public class Transaction {
    private final double amount;
    private final String type;      
    private final LocalDate date;
    private final String category;

    public Transaction(double amount, String type, LocalDate date, String category) {
        this.amount = amount;
        this.type = type;
        this.date = date;
        this.category = category;
    }

    public double getAmount() {
        return amount;
    }

    public String getType() {
        return type;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getCategory() {
        return category;
    }
}
