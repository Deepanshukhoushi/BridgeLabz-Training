package com.vehiclerentalapplication;

public class Truck extends Vehicle {

    public Truck(String vehicleNumber) {
        super(vehicleNumber, 2000);
    }

    @Override
    public double calculateRent(int days) {
        double loadCharge = 1000;
        return (baseRate * days) + loadCharge;
    }

    @Override
    public void displayInfo() {
        System.out.println("Truck Number: " + vehicleNumber);
    }
}
