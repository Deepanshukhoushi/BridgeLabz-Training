package com.linkedlist.singly.inventorymanagementsystem;
import java.util.Scanner;

public class InventoryManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        InventoryList inventory = new InventoryList();
        int choice;

        do {
            System.out.println("\n--- Inventory Management ---");
            System.out.println("1. Add Item (Beginning)");
            System.out.println("2. Add Item (End)");
            System.out.println("3. Add Item (Position)");
            System.out.println("4. Remove Item");
            System.out.println("5. Update Quantity");
            System.out.println("6. Search by ID");
            System.out.println("7. Search by Name");
            System.out.println("8. Total Inventory Value");
            System.out.println("9. Sort by Name");
            System.out.println("10. Sort by Price");
            System.out.println("11. Display All");
            System.out.println("12. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1 -> {
                    System.out.print("Enter Item ID: ");
                    int id = sc.nextInt();

                    System.out.print("Enter Item Name: ");
                    String name = sc.next();

                    System.out.print("Enter Quantity: ");
                    int qty = sc.nextInt();

                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();

                    inventory.addAtBeginning(id, name, qty, price);
                }

                case 2 -> {
                    System.out.print("Enter Item ID: ");
                    int id = sc.nextInt();

                    System.out.print("Enter Item Name: ");
                    String name = sc.next();

                    System.out.print("Enter Quantity: ");
                    int qty = sc.nextInt();

                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();

                    inventory.addAtEnd(id, name, qty, price);
                }

                case 3 -> {
                    System.out.print("Enter Position: ");
                    int pos = sc.nextInt();

                    System.out.print("Enter Item ID: ");
                    int id = sc.nextInt();

                    System.out.print("Enter Item Name: ");
                    String name = sc.next();

                    System.out.print("Enter Quantity: ");
                    int qty = sc.nextInt();

                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();

                    inventory.addAtPosition(pos, id, name, qty, price);
                }

                case 4 -> {
                    System.out.print("Enter Item ID to Remove: ");
                    inventory.removeById(sc.nextInt());
                }

                case 5 -> {
                    System.out.print("Enter Item ID: ");
                    int id = sc.nextInt();

                    System.out.print("Enter New Quantity: ");
                    int qty = sc.nextInt();

                    inventory.updateQuantity(id, qty);
                }

                case 6 -> {
                    System.out.print("Enter Item ID to Search: ");
                    inventory.searchById(sc.nextInt());
                }

                case 7 -> {
                    System.out.print("Enter Item Name to Search: ");
                    inventory.searchByName(sc.next());
                }

                case 8 -> inventory.calculateTotalValue();

                case 9 -> inventory.sortByName(true);

                case 10 -> inventory.sortByPrice(true);

                case 11 -> inventory.displayAll();

                case 12 -> System.out.println("Exiting...");

                default -> System.out.println("Invalid choice!");
            }

        } while (choice != 12);

        sc.close();
    }
}
