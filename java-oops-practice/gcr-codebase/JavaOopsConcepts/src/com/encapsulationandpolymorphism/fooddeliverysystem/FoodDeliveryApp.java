package com.encapsulationandpolymorphism.fooddeliverysystem;

import java.util.ArrayList;
import java.util.List;

public class FoodDeliveryApp {

    public static void main(String[] args) {

        List<FoodItem> orderItems = new ArrayList<>();

        orderItems.add(new VegItem("Paneer Butter Masala", 250, 2));
        orderItems.add(new NonVegItem("Chicken Biryani", 300, 1));
        orderItems.add(new VegItem("Butter Naan", 40, 4));

        OrderProcessor.processOrder(orderItems);
    }
}
