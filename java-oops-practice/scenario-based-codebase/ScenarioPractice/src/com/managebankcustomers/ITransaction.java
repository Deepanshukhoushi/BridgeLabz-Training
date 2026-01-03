package com.managebankcustomers;

interface ITransaction {
    void deposit(double amount);
    void withdraw(double amount);
    void checkBalance();
}