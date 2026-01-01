package com.inheritance.hierarchical.bankaccount;

public class BankMain {
    public static void main(String[] args) {

        SavingsAccount savings =
                new SavingsAccount("SB101", 50000, 4.5);

        CheckingAccount checking =
                new CheckingAccount("CA202", 30000, 20000);

        FixedDepositAccount fd =
                new FixedDepositAccount("FD303", 100000, 24);

        savings.displayAccountType();
        System.out.println();

        checking.displayAccountType();
        System.out.println();

        fd.displayAccountType();
    }
}
