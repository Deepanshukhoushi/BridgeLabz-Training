package com.encapsulationandpolymorphism.fooddeliverysystem;

import java.util.List;

public class OrderProcessor {

    public static void processOrder(List<FoodItem> items) {

        double grandTotal = 0;

        for (FoodItem item : items) {

            item.getItemDetails();

            double totalPrice = item.calculateTotalPrice();
            grandTotal += totalPrice;

            if (item instanceof Discountable) {
                System.out.println(((Discountable) item).getDiscountDetails());
            }

            System.out.println("Total Price: ₹" + totalPrice);
            System.out.println("----------------------------------");
        }

        System.out.println("Grand Total Amount: ₹" + grandTotal);
    }
}