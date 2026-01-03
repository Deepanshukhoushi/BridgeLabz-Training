package com.ewalletapplication;

public class EWalletApp {

    public static void main(String[] args) {

        User user1 = new User(
                "Rohit",
                new PersonalWallet(3000),
                200
        );

        User user2 = new User(
                "CompanyX",
                new BusinessWallet(10000)
        );

        System.out.println("Initial Balance Rohit: ₹" + user1.getWallet().getBalance());
        System.out.println("Initial Balance CompanyX: ₹" + user2.getWallet().getBalance());

        user1.getWallet().transferTo(user2, 1500);
        user2.getWallet().transferTo(user1, 2000);

        System.out.println("\n--- Rohit Transactions ---");
        user1.getWallet().printTransactions();

        System.out.println("\n--- CompanyX Transactions ---");
        user2.getWallet().printTransactions();

        System.out.println("\nFinal Balance Rohit: ₹" + user1.getWallet().getBalance());
        System.out.println("Final Balance CompanyX: ₹" + user2.getWallet().getBalance());
    }
}

