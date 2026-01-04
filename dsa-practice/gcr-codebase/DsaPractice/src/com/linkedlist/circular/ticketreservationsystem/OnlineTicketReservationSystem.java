package com.linkedlist.circular.ticketreservationsystem;

import java.util.Scanner;

public class OnlineTicketReservationSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TicketCircularLinkedList tickets = new TicketCircularLinkedList();
        int choice;

        do {
            System.out.println("\n--- Online Ticket Reservation System ---");
            System.out.println("1. Book Ticket");
            System.out.println("2. Cancel Ticket");
            System.out.println("3. Display All Tickets");
            System.out.println("4. Search by Customer Name");
            System.out.println("5. Search by Movie Name");
            System.out.println("6. Count Tickets");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");

            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                case 1 -> {
                    System.out.print("Ticket ID: ");
                    int id = Integer.parseInt(sc.nextLine());

                    System.out.print("Customer Name: ");
                    String customer = sc.nextLine();

                    System.out.print("Movie Name: ");
                    String movie = sc.nextLine();

                    System.out.print("Seat Number: ");
                    String seat = sc.nextLine();

                    System.out.print("Booking Time: ");
                    String time = sc.nextLine();

                    tickets.addTicket(id, customer, movie, seat, time);
                }

                case 2 -> {
                    System.out.print("Enter Ticket ID: ");
                    tickets.removeTicket(Integer.parseInt(sc.nextLine()));
                }

                case 3 -> tickets.displayTickets();

                case 4 -> {
                    System.out.print("Enter Customer Name: ");
                    tickets.searchByCustomer(sc.nextLine());
                }

                case 5 -> {
                    System.out.print("Enter Movie Name: ");
                    tickets.searchByMovie(sc.nextLine());
                }

                case 6 -> tickets.countTickets();

                case 7 -> System.out.println("Exiting system...");
                default -> System.out.println("Invalid choice!");
            }

        } while (choice != 7);

        sc.close();
    }
}
