package com.encapsulationandpolymorphism.vehiclerentalsystem;

public class Auto extends Vehicle implements GPS {

    public Auto(int vehicleId, String driverName) {
        super(vehicleId, driverName, 12); // ₹12 per km
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm() + 20; // base charge
    }

    @Override
    public String getCurrentLocation() {
        return getCurrentLocationInternal();
    }

    @Override
    public void updateLocation(String newLocation) {
        setCurrentLocation(newLocation);
    }
}