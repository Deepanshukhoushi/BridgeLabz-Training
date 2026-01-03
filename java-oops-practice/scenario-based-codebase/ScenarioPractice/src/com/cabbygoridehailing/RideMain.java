package com.cabbygoridehailing;
import java.util.Scanner;
public class RideMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Welcome to CabbyGo ===");

        System.out.print("Enter Driver Name: ");
        String driverName = input.nextLine();

        System.out.print("Enter License Number: ");
        String license = input.nextLine();

        System.out.print("Enter Driver Rating: ");
        double rating = input.nextDouble();

        Driver driver = new Driver(driverName, license, rating);

        System.out.println("\nChoose Vehicle Type:");
        System.out.println("1. Mini\n2. Sedan\n3. SUV");
        System.out.print("Enter choice: ");
        int choice = input.nextInt();

        System.out.print("Enter Vehicle Number: ");
        input.nextLine();
        String vehicleNumber = input.nextLine();

        Vehicle vehicle;
        switch (choice) {
            case 1 -> vehicle = new Mini(vehicleNumber);
            case 2 -> vehicle = new Sedan(vehicleNumber);
            case 3 -> vehicle = new SUV(vehicleNumber);
            default -> {
                System.out.println("Invalid choice!");
                return;
            }
        }

        System.out.print("Enter Distance (in km): ");
        double distance = input.nextDouble();

        RideService ride = new RideService(vehicle, driver);
        ride.bookRide(distance);
        ride.endRide();

        input.close();
    }
}