package com.medistore;

import java.time.LocalDate;
import java.util.Scanner;

public class MediStoreApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select Medicine Type:");
        System.out.println("1. Tablet");
        System.out.println("2. Syrup");
        System.out.println("3. Injection");
        int choice = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter medicine name: ");
        String name = sc.nextLine();

        System.out.print("Enter price per unit: ");
        double price = sc.nextDouble();

        System.out.print("Enter quantity available: ");
        int quantity = sc.nextInt();

        System.out.print("Enter expiry date (yyyy-mm-dd): ");
        LocalDate expiryDate = LocalDate.parse(sc.next());

        ISellable medicine = null;

        switch (choice) {
            case 1:
                medicine = new Tablet(name, price, expiryDate, quantity);
                break;
            case 2:
                medicine = new Syrup(name, price, expiryDate, quantity);
                break;
            case 3:
                medicine = new Injection(name, price, expiryDate, quantity);
                break;
            default:
                System.out.println("Invalid choice");
                System.exit(0);
        }

        System.out.print("Enter units to sell: ");
        int unitsToSell = sc.nextInt();

        medicine.sell(unitsToSell);
        medicine.checkExpiry();

        sc.close();
    }
}
