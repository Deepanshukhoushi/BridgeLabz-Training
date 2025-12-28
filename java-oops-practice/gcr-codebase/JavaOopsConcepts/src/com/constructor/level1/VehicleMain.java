package com.constructor.level1;

public class VehicleMain {

    public static void main(String[] args) {

        Vehicle v1 = new Vehicle("Ramesh Kumar", "Two Wheeler");
        Vehicle v2 = new Vehicle("Sneha Sharma", "Four Wheeler");

        // Before updating registration fee
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        // Update registration fee for all vehicles
        Vehicle.updateRegistrationFee(3000.0);

        // After updating registration fee
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}
