package com.javagenerics.smartwarehousemanagementsystem;
import java.util.Scanner;

public class SmartWarehouseSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Storage<Electronics> electronicsStorage = new Storage<>();
        Storage<Groceries> groceriesStorage = new Storage<>();
        Storage<Furniture> furnitureStorage = new Storage<>();

        System.out.print("Enter number of items: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.println("\nChoose Item Type:");
            System.out.println("1. Electronics");
            System.out.println("2. Groceries");
            System.out.println("3. Furniture");
            int choice = sc.nextInt();
            sc.nextLine(); 

            System.out.print("Enter item name: ");
            String name = sc.nextLine();

            System.out.print("Enter price: ");
            double price = sc.nextDouble();

            switch (choice) {
                case 1:
                    electronicsStorage.addItem(new Electronics(name, price));
                    break;
                case 2:
                    groceriesStorage.addItem(new Groceries(name, price));
                    break;
                case 3:
                    furnitureStorage.addItem(new Furniture(name, price));
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }

        System.out.println("\nElectronics Items:");
        WarehouseUtil.displayItems(electronicsStorage.getItems());

        System.out.println("\nGroceries Items:");
        WarehouseUtil.displayItems(groceriesStorage.getItems());

        System.out.println("\nFurniture Items:");
        WarehouseUtil.displayItems(furnitureStorage.getItems());

        sc.close();
    }
}
