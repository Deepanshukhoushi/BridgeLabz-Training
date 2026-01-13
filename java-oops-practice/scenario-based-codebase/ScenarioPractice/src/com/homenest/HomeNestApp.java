package com.homenest;
import java.util.Scanner;
public class HomeNestApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Device device = null;

        System.out.println("Welcome to HomeNest Smart Home Manager");
        System.out.println("Select device to register:");
        System.out.println("1. Light");
        System.out.println("2. Camera");
        System.out.println("3. Thermostat");
        System.out.println("4. Lock");

        int choice = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Device ID: ");
        String deviceId = scanner.nextLine();

        switch (choice) {
            case 1 -> device = new Light(deviceId);
            case 2 -> device = new Camera(deviceId);
            case 3 -> device = new Thermostat(deviceId);
            case 4 -> device = new Lock(deviceId);
            default -> {
                System.out.println("Invalid choice");
                System.exit(0);
            }
        }

        while (true) {
            System.out.println("\n--- Device Menu ---");
            System.out.println("1. Turn ON");
            System.out.println("2. Turn OFF");
            System.out.println("3. Reset Device");
            System.out.println("4. Calculate Energy Usage");
            System.out.println("5. Exit");

            int action = scanner.nextInt();

            switch (action) {
                case 1 -> device.turnOn();
                case 2 -> device.turnOff();
                case 3 -> device.reset();
                case 4 -> {
                    System.out.print("Enter usage hours: ");
                    double hours = scanner.nextDouble();
                    double energy = device.calculateEnergy(hours);
                    System.out.println("Energy Used: " + energy + " units");
                }
                case 5 -> {
                    System.out.println("Exiting HomeNest. Goodbye!");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Invalid option");
            }
        }
    }
}
