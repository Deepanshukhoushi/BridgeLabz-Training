package com.inheritance.hybrid.vehiclemanagement;

public class VehicleMain {
    public static void main(String[] args) {

        ElectricVehicle ev =
                new ElectricVehicle("Tesla Model 3", 225);

        PetrolVehicle pv =
                new PetrolVehicle("Honda City", 180);

        System.out.println("Electric Vehicle:");
        ev.displayDetails();
        ev.charge();

        System.out.println();

        System.out.println("Petrol Vehicle:");
        pv.displayDetails();
        pv.refuel();
    }
}
