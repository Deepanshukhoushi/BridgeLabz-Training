package com.encapsulationandpolymorphism.ridehailingapplication;

public class Car extends Vehicle implements Insurable {

    public Car(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Car", rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return rentalRate * days;
    }

    @Override
    public double calculateInsurance() {
        return 500;
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance: ₹500";
    }
}
