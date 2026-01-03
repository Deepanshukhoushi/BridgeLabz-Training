package com.vehiclerentalapplication;

public class Bike extends Vehicle {

    public Bike(String vehicleNumber) {
        super(vehicleNumber, 300);
    }

    @Override
    public double calculateRent(int days) {
        return baseRate * days;
    }

    @Override
    public void displayInfo() {
        System.out.println("Bike Number: " + vehicleNumber);
    }
}

