package com.constructor.level1;

public class Vehicle {

    private String ownerName;
    private String vehicleType;

    // Class variable (shared by all vehicles)
    private static double registrationFee = 2500.0;

    // Parameterized constructor
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method
    public void displayVehicleDetails() {
        System.out.println("Owner Name        : " + ownerName);
        System.out.println("Vehicle Type      : " + vehicleType);
        System.out.println("Registration Fee  : ₹" + registrationFee);
        System.out.println();
    }

    // Class (static) method
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
}
