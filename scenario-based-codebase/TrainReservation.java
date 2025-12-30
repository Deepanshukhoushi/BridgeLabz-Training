/*
12. Train Reservation Queue 🚆
Simulate a basic ticket booking system.
● Show menu with switch
● Allow multiple bookings using while-loop.
● Stop booking once seats reach zero (break).
*/

import java.util.Scanner;

public class TrainReservation {
    static final int MAX_TICKETS = 10;
    static int availableTickets = MAX_TICKETS;
    static int bookingCount = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\nTRAIN RESERVATION SYSTEM ");
            System.out.println("1. Book Ticket");
            System.out.println("2. View Booking History");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            choice = input.nextInt();

            switch (choice) {
                case 1:
                    if (availableTickets == 0) {
                        System.out.println("No seats available. Booking closed!");
                        break;
                    }
                    bookTicket(input);
                    break;

                case 2:
                    showHistory();
                    break;

                case 3:
                    System.out.println("Thank you for using Train Reservation System");
                    return;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }

    // ------------------ BOOK TICKET ------------------
    static void bookTicket(Scanner input) {
        System.out.println("\nChoose Quota:");
        System.out.println("1. General");
        System.out.println("2. Tatkal");
        System.out.println("3. Women");
        System.out.println("4. Specially Abled");
        System.out.print("Enter quota: ");

        int quota = input.nextInt();
        input.nextLine(); // consume newline

        System.out.print("Enter First Name: ");
        String firstName = input.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = input.nextLine();

        if (quota == 1 || quota == 3) {
            chooseBerth(input);
        }

        bookingCount++;
        System.out.println("\nTicket Booked Successfully!");
        System.out.println("Passenger: " + firstName + " " + lastName);
        System.out.println("Ticket No: " + availableTickets);

        availableTickets--;

        if (availableTickets == 0) {
            System.out.println("All seats filled!");
        }
    }

    // ------------------ BERTH SELECTION ------------------
    static void chooseBerth(Scanner input) {
        System.out.println("Berth Preference:");
        System.out.println("1. Lower");
        System.out.println("2. Upper");
        System.out.println("3. Middle");
        System.out.println("4. Side Lower");
        System.out.println("5. Side Upper");
        System.out.print("Choose: ");
        input.nextInt();
    }

    // ------------------ BOOKING HISTORY ------------------
    static void showHistory() {
        System.out.println("\nBOOKING HISTORY");
        System.out.println("Total Booked Tickets: " + bookingCount);
        System.out.println("Available Tickets: " + availableTickets);
    }
}
