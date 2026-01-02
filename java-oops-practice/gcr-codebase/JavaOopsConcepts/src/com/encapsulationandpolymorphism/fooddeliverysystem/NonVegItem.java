package com.encapsulationandpolymorphism.fooddeliverysystem;

public class NonVegItem extends FoodItem implements Discountable {

    private static final double GST = 0.08;       // 8% GST
    private static final double NON_VEG_CHARGE = 50; // extra charge

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        double baseAmount = (getPrice() * getQuantity()) + NON_VEG_CHARGE;
        return baseAmount + (baseAmount * GST) - applyDiscount();
    }

    @Override
    public double applyDiscount() {
        return getPrice() * getQuantity() * 0.05; // 5% discount
    }

    @Override
    public String getDiscountDetails() {
        return "5% discount + ₹50 Non-Veg charge";
    }
}