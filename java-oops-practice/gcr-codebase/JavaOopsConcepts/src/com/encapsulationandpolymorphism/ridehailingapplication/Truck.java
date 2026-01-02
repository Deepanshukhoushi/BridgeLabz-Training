package com.encapsulationandpolymorphism.ridehailingapplication;

public class Truck extends Vehicle implements Insurable {

    public Truck(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Truck", rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return (rentalRate * days) + 1000; // heavy vehicle surcharge
    }

    @Override
    public double calculateInsurance() {
        return 1500;
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance: ₹1500";
    }
}
