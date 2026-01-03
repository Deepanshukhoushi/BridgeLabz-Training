package com.vehiclerentalapplication;

public class Car extends Vehicle {

    public Car(String vehicleNumber) {
        super(vehicleNumber, 1000);
    }

    @Override
    public double calculateRent(int days) {
        double surcharge = 500; // fixed service charge
        return (baseRate * days) + surcharge;
    }

    @Override
    public void displayInfo() {
        System.out.println("Car Number: " + vehicleNumber);
    }
}
