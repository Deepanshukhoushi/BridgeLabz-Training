package com.ewalletapplication;

import java.util.ArrayList;
import java.util.List;

public abstract class Wallet implements Transferrable {

    private double balance;
    protected List<Transaction> transactions;

    protected Wallet(double initialBalance) {
        this.balance = initialBalance;
        this.transactions = new ArrayList<>();
    }

    protected boolean deduct(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    protected void add(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }

    public void addTransaction(String description, double amount) {
        transactions.add(new Transaction(description, amount));
    }

    public void printTransactions() {
        for (Transaction t : transactions) {
            t.printTransaction();
        }
    }
}
