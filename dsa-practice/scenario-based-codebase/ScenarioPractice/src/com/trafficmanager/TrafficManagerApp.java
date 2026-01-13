package com.trafficmanager;
import java.util.Scanner;
public class TrafficManagerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Roundabout roundabout = new Roundabout();
        VehicleQueue queue = new VehicleQueue(5);

        int choice;
        do {
            System.out.println("\nTraffic Manager Menu");
            System.out.println("1. Vehicle enters waiting queue");
            System.out.println("2. Move vehicle from queue to roundabout");
            System.out.println("3. Remove vehicle from roundabout");
            System.out.println("4. Display roundabout");
            System.out.println("5. Display waiting queue");
            System.out.println("6. Exit");
            System.out.print("Choose: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter vehicle number: ");
                    queue.enqueue(sc.nextLine());
                    break;

                case 2:
                    String vehicle = queue.dequeue();
                    if (vehicle != null) {
                        roundabout.addVehicle(vehicle);
                        System.out.println("Vehicle entered roundabout");
                    }
                    break;

                case 3:
                    System.out.print("Enter vehicle number to remove: ");
                    roundabout.removeVehicle(sc.nextLine());
                    break;

                case 4:
                    roundabout.display();
                    break;

                case 5:
                    queue.display();
                    break;

                case 6:
                    System.out.println("Traffic system shutting down");
                    break;

                default:
                    System.out.println("Invalid option");
            }

        } while (choice != 6);

        sc.close();
    }
}
