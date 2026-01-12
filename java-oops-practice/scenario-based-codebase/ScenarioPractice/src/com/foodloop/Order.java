package com.foodloop;

import java.util.ArrayList;
class Order implements IOrderable {
    private ArrayList<FoodItem> items = new ArrayList<>();
    private double total;

    public void addItem(FoodItem item) {
        if (item.isAvailable()) {
            items.add(item);
            item.reduceStock();
        } else {
            System.out.println(item.getName() + " is out of stock!");
        }
    }

    public void calculateTotal() {
        total = 0;
        for (FoodItem item : items) {
            total += item.getPrice();
        }
        total -= applyDiscount();
    }

    // Polymorphism
    public double applyDiscount() {
        if (total > 1000) {
            return total * 0.20;
        } else if (total > 500) {
            return total * 0.10;
        }
        return 0;
    }

    @Override
    public void placeOrder() {
        calculateTotal();
        System.out.println("Order placed successfully!");
        System.out.println("Total Amount: ₹" + total);
    }

    @Override
    public void cancelOrder() {
        items.clear();
        total = 0;
        System.out.println("Order cancelled.");
    }
}
