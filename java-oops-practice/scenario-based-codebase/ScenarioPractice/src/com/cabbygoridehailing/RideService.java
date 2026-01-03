package com.cabbygoridehailing;

class RideService implements IRideService {
    private Vehicle vehicle;
    private Driver driver;

    public RideService(Vehicle vehicle, Driver driver) {
        this.vehicle = vehicle;
        this.driver = driver;
    }

    public void bookRide(double distance) {
        vehicle.calculateFare(distance);
        System.out.println("\n🚕 Ride Booked Successfully!");
        System.out.println("Vehicle: " + vehicle.getVehicleDetails());
        System.out.println("Driver: " + driver.getDriverInfo());
        System.out.println("Estimated Fare: ₹" + vehicle.getFare());
    }

    public void endRide() {
        System.out.println("\n✅ Ride Ended. Thank you for using CabbyGo!");
    }
}