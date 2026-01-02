package com.encapsulationandpolymorphism.ridehailingapplication;

public abstract class Vehicle {

    private String vehicleNumber;
    private String type;
    protected double rentalRate;

    // Sensitive detail (encapsulated)
    private String insurancePolicyNumber;

    protected Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    // Encapsulation: getters only
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    // Controlled access to sensitive data
    public void setInsurancePolicyNumber(String policyNumber) {
        this.insurancePolicyNumber = policyNumber;
    }

    protected String getInsurancePolicyNumber() {
        return insurancePolicyNumber;
    }

    // Abstract method
    public abstract double calculateRentalCost(int days);
}
