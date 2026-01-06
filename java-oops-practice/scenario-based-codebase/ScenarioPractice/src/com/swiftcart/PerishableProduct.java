package com.swiftcart;

public class PerishableProduct extends Product {

    public PerishableProduct(String name, double price) {
        super(name, price, "Perishable");
    }

    @Override
    public double getDiscount(double totalAmount) {
        return totalAmount * 0.10; // 10% discount
    }
}
