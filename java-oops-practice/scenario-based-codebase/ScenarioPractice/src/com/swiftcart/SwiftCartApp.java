package com.swiftcart;

import java.util.Scanner;

public class SwiftCartApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Cart cart = new Cart();

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            sc.nextLine();

            System.out.println("\nProduct " + i);
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();

            System.out.print("Quantity: ");
            int qty = sc.nextInt();

            System.out.print("Type (1-Perishable, 2-Non-Perishable): ");
            int type = sc.nextInt();

            Product product;
            if (type == 1) {
                product = new PerishableProduct(name, price);
            } else {
                product = new NonPerishableProduct(name, price);
            }

            cart.addProduct(product, qty);
        }

        cart.applyDiscount();
        cart.generateBill();

        sc.close();
    }
}

