package com.foodloop;

import java.util.Scanner;

public class FoodLoopApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Order order = new Order();

        System.out.print("Enter number of food items to order: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {

            System.out.println("\nFood Item " + i);
            System.out.print("Enter food name: ");
            String name = sc.nextLine();

            System.out.print("Enter price: ");
            double price = sc.nextDouble();

            System.out.print("Enter stock: ");
            int stock = sc.nextInt();

            System.out.print("Select category (1-Veg, 2-NonVeg): ");
            int choice = sc.nextInt();
            sc.nextLine();

            FoodItem item;
            if (choice == 1) {
                item = new VegItem(name, price, stock);
            } else {
                item = new NonVegItem(name, price, stock);
            }

            order.addItem(item);
        }

        System.out.println("\n1. Place Order");
        System.out.println("2. Cancel Order");
        System.out.print("Choose option: ");
        int option = sc.nextInt();

        if (option == 1) {
            order.placeOrder();
        } else {
            order.cancelOrder();
        }

        sc.close();
    }
}
