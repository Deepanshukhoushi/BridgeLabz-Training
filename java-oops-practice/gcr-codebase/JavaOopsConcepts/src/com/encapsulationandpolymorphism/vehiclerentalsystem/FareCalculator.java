package com.encapsulationandpolymorphism.vehiclerentalsystem;

import java.util.List;

public class FareCalculator {

    public static void calculateFares(List<Vehicle> vehicles, double distance) {

        for (Vehicle vehicle : vehicles) {

            vehicle.getVehicleDetails();

            double fare = vehicle.calculateFare(distance);
            System.out.println("Distance: " + distance + " km");
            System.out.println("Total Fare: ₹" + fare);

            System.out.println("----------------------------------");
        }
    }
}