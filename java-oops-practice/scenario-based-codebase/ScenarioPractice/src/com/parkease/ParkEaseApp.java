package com.parkease;

import java.util.Scanner;

public class ParkEaseApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Slot ID: ");
        int slotId = sc.nextInt();

        System.out.print("Allowed Vehicle Type (Car/Bike/Truck): ");
        String allowedType = sc.next();

        ParkingSlot slot = new ParkingSlot(slotId, allowedType);

        System.out.print("Enter Vehicle Type (Car/Bike/Truck): ");
        String vehicleType = sc.next();

        System.out.print("Enter Vehicle Number: ");
        String vehicleNumber = sc.next();

        System.out.print("Enter Parking Duration (hours): ");
        int hours = sc.nextInt();

        Vehicle vehicle;

        switch (vehicleType) {
            case "Car":
                vehicle = new Car(vehicleNumber);
                break;
            case "Bike":
                vehicle = new Bike(vehicleNumber);
                break;
            default:
                vehicle = new Truck(vehicleNumber);
        }

        ParkingManager manager = new ParkingManager();
        manager.parkVehicle(slot, vehicle, hours);

        System.out.println("Logs: " + manager.getLogs());

        sc.close();
    }
}
