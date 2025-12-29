/*
6. Parking Lot Gate System 🚗
Develop a smart parking system.
● Options: Park, Exit, Show Occupancy
● Use switch-case for the menu.
● while loop to continue until the parking lot is full or the user exits.
*/


import java.util.Scanner;
public class ParkingSystem {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int availability = 5;   // total parking capacity
        int occupancy = 0;      // cars parked
        boolean exit = true;

        while (exit) {
            System.out.println("\nEnter 0 if you want to park: ");
            System.out.println("Enter 1 if you want to exit: ");
            System.out.println("Enter 2 to check availability: ");
            System.out.println("Enter 3 to close parking: ");

            int need = input.nextInt();

            switch (need) {

                case 0: {
                    // FIXED LOGIC
                    if (occupancy < availability) {
                        occupancy++;
                        System.out.println("The car is parked");
                        System.out.println("Availability = " + (availability - occupancy));
                    } else {
                        System.out.println("Parking is Full");
                        exit = false;
                    }
                    break;
                }

                case 1: {
                    // FIXED MESSAGE LOGIC
                    if (occupancy > 0) {
                        occupancy--;
                        System.out.println("The car exited successfully");
                    } else {
                        System.out.println("No cars to exit");
                    }
                    System.out.println("Availability = " + (availability - occupancy));
                    break;
                }

                case 2: {
                    System.out.println("Availability = " + (availability - occupancy));
                    break;
                }

                case 3: {
                    exit = false;
                    System.out.println("Parking Closed");
                    break;
                }

                default: {
                    System.out.println("Invalid input");
                }
            }
        }

        input.close();
    }
}
