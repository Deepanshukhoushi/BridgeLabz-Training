/*
19. Bus Route Distance Tracker 🚌
Each stop adds distance.
● Ask if the passenger wants to get off at a stop.
● Use a while-loop with a total distance tracker.
● Exit on user confirmation.
*/

import java.util.Scanner;
public class BusRouteDistanceTracker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalDistance = 0;
        int stopNumber = 1;
        char getOffChoice;

        System.out.println("Welcome to the Bus Route Distance Tracker");
        System.out.println("Each stop adds distance to your journey.\n");

        while (true) {

            System.out.print("Enter distance covered from Stop " + stopNumber + " (in km): ");
            int distance = input.nextInt();
            totalDistance += distance;

            System.out.println("You have reached Stop " + stopNumber);
            System.out.println("Total distance travelled so far: " + totalDistance + " km");

            System.out.print("Do you want to get off at this stop? (y/n): ");
            getOffChoice = input.next().toLowerCase().charAt(0);

            if (getOffChoice == 'y') {
                System.out.println("\nPassenger got off the bus.");
                break;
            }

            stopNumber++;
            System.out.println("Continuing to next stop...\n");
        }

        System.out.println("\nJourney Completed");
        System.out.println("Total Stops Covered: " + stopNumber);
        System.out.println("Final Distance Travelled: " + totalDistance + " km");

        input.close();
    }
}
