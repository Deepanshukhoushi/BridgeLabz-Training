package com.constructor.level1;

public class CarRental {

    private String customerName;
    private String carModel;
    private int rentalDays;
    private static final double COST_PER_DAY = 1500.0;

    // Default constructor
    public CarRental() {
        this.customerName = "Guest";
        this.carModel = "Standard";
        this.rentalDays = 1;
    }

    // Parameterized constructor
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    // Method to calculate total cost
    public double calculateTotalCost() {
        return rentalDays * COST_PER_DAY;
    }

    // Method to display rental details
    public void displayRentalDetails() {
        System.out.println("Customer Name : " + customerName);
        System.out.println("Car Model     : " + carModel);
        System.out.println("Rental Days   : " + rentalDays);
        System.out.println("Total Cost    : ₹" + calculateTotalCost());
        System.out.println();
    }
}
