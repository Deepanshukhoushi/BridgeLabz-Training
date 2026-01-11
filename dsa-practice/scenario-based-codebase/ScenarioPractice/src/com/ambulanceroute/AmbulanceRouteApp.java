package com.ambulanceroute;
import java.util.Scanner;
public class AmbulanceRouteApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AmbulanceRoute route = new AmbulanceRoute();

        route.addUnit("Emergency");
        route.addUnit("Radiology");
        route.addUnit("Surgery");
        route.addUnit("ICU");

        while (true) {
            System.out.println("\n--- Ambulance Route System ---");
            System.out.println("1. Display Units");
            System.out.println("2. Find Available Unit");
            System.out.println("3. Mark Unit Unavailable");
            System.out.println("4. Remove Unit (Maintenance)");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    route.displayUnits();
                    break;
                case 2:
                    route.findAvailableUnit();
                    break;
                case 3:
                    System.out.print("Enter unit name: ");
                    route.markUnavailable(sc.nextLine());
                    break;
                case 4:
                    System.out.print("Enter unit name: ");
                    route.removeUnit(sc.nextLine());
                    break;
                case 5:
                    System.out.println("System closed.");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option!");
            }
        }
    }
}