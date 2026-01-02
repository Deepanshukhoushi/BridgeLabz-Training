package com.encapsulationandpolymorphism.ridehailingapplication;

import java.util.List;

public class RentalProcessor {

    public static void processRentals(List<Vehicle> vehicles, int days) {

        for (Vehicle vehicle : vehicles) {

            double rentalCost = vehicle.calculateRentalCost(days);
            double insuranceCost = 0;

            if (vehicle instanceof Insurable) {
                insuranceCost = ((Insurable) vehicle).calculateInsurance();
            }

            System.out.println("Vehicle Type: " + vehicle.getType());
            System.out.println("Vehicle Number: " + vehicle.getVehicleNumber());
            System.out.println("Rental Cost (" + days + " days): ₹" + rentalCost);
            System.out.println("Insurance Cost: ₹" + insuranceCost);
            System.out.println("Total Cost: ₹" + (rentalCost + insuranceCost));
            System.out.println("----------------------------------");
        }
    }
}
