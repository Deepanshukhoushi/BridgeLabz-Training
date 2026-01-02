package com.encapsulationandpolymorphism.fooddeliverysystem;

public abstract class FoodItem {

    private String itemName;
    private double price;
    private int quantity;

    protected FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Encapsulation: getters (no direct modification)
    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Controlled update
    public void updateQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        }
    }

    // Abstract pricing logic
    public abstract double calculateTotalPrice();

    // Concrete method
    public void getItemDetails() {
        System.out.println("Item: " + itemName);
        System.out.println("Price: ₹" + price);
        System.out.println("Quantity: " + quantity);
    }
}
