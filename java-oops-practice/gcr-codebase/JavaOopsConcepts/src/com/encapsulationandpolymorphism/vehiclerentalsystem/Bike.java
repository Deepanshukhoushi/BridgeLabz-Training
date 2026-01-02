package com.encapsulationandpolymorphism.vehiclerentalsystem;


public class Bike extends Vehicle implements GPS {

    public Bike(int vehicleId, String driverName) {
        super(vehicleId, driverName, 8); // ₹8 per km
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
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
