package com.swiftcart;

import java.util.ArrayList;
import java.util.List;

public class Cart implements ICheckout {

    private List<Product> products;
    private double totalPrice;

    // Constructor without items
    public Cart() {
        products = new ArrayList<>();
        totalPrice = 0;
    }

    // Constructor with pre-selected items
    public Cart(List<Product> products) {
        this.products = products;
        calculateTotal();
    }

    public void addProduct(Product product, int quantity) {
        for (int i = 0; i < quantity; i++) {
            products.add(product);
            totalPrice += product.getPrice(); // Only Cart updates price
        }
    }

    private void calculateTotal() {
        totalPrice = 0;
        for (Product p : products) {
            totalPrice += p.getPrice();
        }
    }

    @Override
    public void applyDiscount() {
        double discount = 0;

        for (Product p : products) {
            discount += p.getDiscount(totalPrice);
        }

        totalPrice = totalPrice - discount; // operator usage
        System.out.println("Discount Applied: ₹" + discount);
    }

    @Override
    public void generateBill() {
        System.out.println("\n--- SwiftCart Bill ---");
        for (Product p : products) {
            System.out.println(p.getName() + " - ₹" + p.getPrice());
        }
        System.out.println("Final Amount: ₹" + totalPrice);
    }
}
