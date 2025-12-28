package com.constructor.level1;

public class Product {

    private String productName;
    private double price;

    // Class variable (shared by all objects)
    private static int totalProducts = 0;

    // Parameterized constructor
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; // increment when a product is created
    }

    // Instance method
    public void displayProductDetails() {
        System.out.println("Product Name : " + productName);
        System.out.println("Price        : ₹" + price);
        System.out.println();
    }

    // Class (static) method
    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }
}
