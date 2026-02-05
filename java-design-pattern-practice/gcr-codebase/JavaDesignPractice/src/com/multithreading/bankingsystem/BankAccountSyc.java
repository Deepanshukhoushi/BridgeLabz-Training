package com.multithreading.bankingsystem;

class BankAccountSyc {

    private int balance = 10000;

    public synchronized boolean withdraw(int amount) {
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
