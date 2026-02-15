package com.jdbc.transactionmanagement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        BankingService service = new BankingService();

        while (true) {
            System.out.println("\n===== Banking System =====");
            System.out.println("1. Transfer Money");
            System.out.println("2. Check Balance");
            System.out.println("3. Transaction History");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("From Account: ");
                    String from = scanner.nextLine();

                    System.out.print("To Account: ");
                    String to = scanner.nextLine();

                    System.out.print("Amount: ");
                    double amount = scanner.nextDouble();

                    service.transferMoney(from, to, amount);
                    break;

                case 2:
                    System.out.print("Account Number: ");
                    String acc = scanner.nextLine();

                    double balance = service.checkBalance(acc);
                    System.out.println("Balance: " + balance);
                    break;

                case 3:
                    System.out.print("Account Number: ");
                    String historyAcc = scanner.nextLine();

                    service.showTransactionHistory(historyAcc);
                    break;

                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
            }
        }
    }
}
