package com.encapsulationandpolymorphism.fooddeliverysystem;

public class VegItem extends FoodItem implements Discountable {

    private static final double GST = 0.05; // 5% GST

    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        double baseAmount = getPrice() * getQuantity();
        return baseAmount + (baseAmount * GST) - applyDiscount();
    }

    @Override
    public double applyDiscount() {
        return getPrice() * getQuantity() * 0.10; // 10% discount
    }

    @Override
    public String getDiscountDetails() {
        return "10% discount on Veg Items";
    }
}
