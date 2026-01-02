package com.encapsulationandpolymorphism.bankingsystem;

import java.util.ArrayList;
import java.util.List;

public class BankingApp {

    public static void main(String[] args) {

        List<BankAccount> accounts = new ArrayList<>();

        BankAccount savings = new SavingsAccount("SB101", "Amit", 75000);
        BankAccount current = new CurrentAccount("CA201", "Riya", 150000);

        savings.deposit(5000);
        current.withdraw(20000);

        accounts.add(savings);
        accounts.add(current);

        InterestCalculator.processAccounts(accounts);
    }
}

