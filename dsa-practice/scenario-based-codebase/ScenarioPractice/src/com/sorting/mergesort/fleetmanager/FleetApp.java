package com.sorting.mergesort.fleetmanager;
import java.util.Scanner;

public class FleetApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of vehicles: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        Vehicle[] vehicles = new Vehicle[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for vehicle " + (i + 1));

            System.out.print("Vehicle ID: ");
            String id = scanner.nextLine();

            System.out.print("Mileage: ");
            int mileage = scanner.nextInt();
            scanner.nextLine(); 

            vehicles[i] = new Vehicle(id, mileage);
        }

        FleetManager.mergeSort(vehicles, 0, vehicles.length - 1);

        System.out.println("\nMaster Maintenance Schedule (Sorted by Mileage):");
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }

        scanner.close();
    }
}
