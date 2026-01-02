package com.encapsulationandpolymorphism.vehiclerentalsystem;

public class Car extends Vehicle implements GPS {

    public Car(int vehicleId, String driverName) {
        super(vehicleId, driverName, 15); // ₹15 per km
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
