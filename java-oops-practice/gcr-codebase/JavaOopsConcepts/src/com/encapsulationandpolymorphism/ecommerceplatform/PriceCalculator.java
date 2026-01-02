package com.encapsulationandpolymorphism.ecommerceplatform;

import java.util.List;
public class PriceCalculator {

    public static void printFinalPrices(List<Product> products) {

        for (Product product : products) {

            double price = product.getPrice();
            double discount = product.calculateDiscount();
            double tax = 0;

            if (product instanceof Taxable) {
                tax = ((Taxable) product).calculateTax();
            }

            double finalPrice = price + tax - discount;

            System.out.println("Product: " + product.getName());
            System.out.println("Base Price: ₹" + price);
            System.out.println("Discount: ₹" + discount);
            System.out.println("Tax: ₹" + tax);
            System.out.println("Final Price: ₹" + finalPrice);
            System.out.println("----------------------------------");
        }
    }
}
