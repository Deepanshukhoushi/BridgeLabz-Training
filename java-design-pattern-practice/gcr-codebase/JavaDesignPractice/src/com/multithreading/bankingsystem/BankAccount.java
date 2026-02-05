package com.multithreading.bankingsystem;

class BankAccount {

    private int balance = 10000;

    public boolean withdraw(int amount) {
        if (balance >= amount) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            balance -= amount;
            return true;
        }
        return false;
    }

    public int getBalance() {
        return balance;
    }
}
