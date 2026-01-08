package com.medistore;

import java.time.LocalDate;

public abstract class Medicine implements ISellable {

    private String name;
    private double price;
    private LocalDate expiryDate;
    private int quantity;

    public Medicine(String name, double price, LocalDate expiryDate) {
        this(name, price, expiryDate, 10);
    }

    public Medicine(String name, double price, LocalDate expiryDate, int quantity) {
        this.name = name;
        this.price = price;
        this.expiryDate = expiryDate;
        this.quantity = quantity;
    }

    protected void updateStock(int units) {
        quantity -= units;
    }

    private double applyDiscount(double total) {
        return total > 500 ? total * 0.9 : total;
    }

    @Override
    public void sell(int units) {
        if (units <= quantity) {
            double totalPrice = applyDiscount(units * price);
            updateStock(units);
            System.out.println(name + " sold successfully");
            System.out.println("Total price: ₹" + totalPrice);
        } else {
            System.out.println("Insufficient stock!");
        }
    }

    protected LocalDate getExpiryDate() {
        return expiryDate;
    }
}
