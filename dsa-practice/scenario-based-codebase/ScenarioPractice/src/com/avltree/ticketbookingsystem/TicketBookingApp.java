package com.avltree.ticketbookingsystem;

import java.util.Scanner;

public class TicketBookingApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EventAVLTree tree = new EventAVLTree();
        int choice;

        do {
            System.out.println("\n--- Online Ticket Booking (AVL Tree) ---");
            System.out.println("1. Add Event");
            System.out.println("2. Cancel Event");
            System.out.println("3. Show Upcoming Events");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Event Time (e.g., 1800): ");
                    int time = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Event Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Venue: ");
                    String venue = sc.nextLine();
                    tree.insert(new Event(time, name, venue));
                    System.out.println("Event added.");
                    break;

                case 2:
                    System.out.print("Enter Event Time to cancel: ");
                    tree.delete(sc.nextInt());
                    System.out.println("Event cancelled.");
                    break;

                case 3:
                    tree.displayUpcomingEvents();
                    break;

                case 4:
                    System.out.println("Exiting system...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 4);

        sc.close();
    }
}
