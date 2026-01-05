package com.hashmapsandhashfunctions.customhashmap;

import java.util.Scanner;

public class CustomHashmapDriver {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        CustomHashmap<Integer, String> map = new CustomHashmap<>(10);

        int choice;

        do {
            System.out.println("\n--- Custom Hash Map ---");
            System.out.println("1. Put");
            System.out.println("2. Get");
            System.out.println("3. Remove");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter key (int): ");
                    int keyPut = input.nextInt();
                    System.out.print("Enter value (string): ");
                    String valuePut = input.next();
                    map.put(keyPut, valuePut);
                    System.out.println("Inserted successfully.");
                    break;

                case 2:
                    System.out.print("Enter key to get: ");
                    int keyGet = input.nextInt();
                    String value = map.get(keyGet);
                    System.out.println(value != null ? "Value: " + value : "Key not found.");
                    break;

                case 3:
                    System.out.print("Enter key to remove: ");
                    int keyRemove = input.nextInt();
                    map.remove(keyRemove);
                    System.out.println("Removed successfully.");
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        input.close();
    }
}
