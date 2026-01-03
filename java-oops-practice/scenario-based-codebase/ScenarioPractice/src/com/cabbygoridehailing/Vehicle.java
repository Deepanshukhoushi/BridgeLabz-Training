package com.cabbygoridehailing;

abstract class Vehicle {
    private String vehicleNumber;
    private int capacity;
    private String type;
    private double fare; // sensitive data

    public Vehicle(String vehicleNumber, int capacity, String type) {
        this.vehicleNumber = vehicleNumber;
        this.capacity = capacity;
        this.type = type;
    }

    public abstract double getRatePerKm();
    public abstract double getBaseFare();

    public void calculateFare(double distance) {
        fare = getBaseFare() + distance * getRatePerKm();
    }

    public double getFare() {
        return fare;
    }

    public String getVehicleDetails() {
        return type + " (" + vehicleNumber + ")";
    }
}