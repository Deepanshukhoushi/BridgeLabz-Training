package com.relationships.ecommerce;

import java.util.ArrayList;

public class Order {

    private int orderId;
    private ArrayList<Product> products;

    public Order(int orderId) {
        this.orderId = orderId;
        this.products = new ArrayList<>();
    }

    public int getOrderId() {
        return orderId;
    }

    public void addProduct(Product product) {
        products.add(product);
        System.out.println(product.getProductName() +
                " added to Order #" + orderId);
    }

    public double calculateTotalAmount() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    public void showOrderDetails() {
        System.out.println("\nOrder ID: " + orderId);
        for (Product product : products) {
            System.out.println("- " + product.getProductName()
                    + " : ₹" + product.getPrice());
        }
        System.out.println("Total Amount: ₹" + calculateTotalAmount());
    }
}
