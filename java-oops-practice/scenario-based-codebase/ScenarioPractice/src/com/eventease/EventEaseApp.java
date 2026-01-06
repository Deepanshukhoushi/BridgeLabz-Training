package com.eventease;

import java.util.Scanner;

public class EventEaseApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Event event = null;

        System.out.print("Enter organizer name: ");
        String userName = sc.nextLine();

        System.out.print("Enter organizer email: ");
        String email = sc.nextLine();

        User user = new User(userName, email);

        System.out.print("Enter event name: ");
        String eventName = sc.nextLine();

        System.out.print("Enter location: ");
        String location = sc.nextLine();

        System.out.print("Enter date (dd-mm-yyyy): ");
        String date = sc.nextLine();

        System.out.print("Enter number of attendees: ");
        int attendees = sc.nextInt();

        System.out.println("\nSelect Event Type:");
        System.out.println("1. Birthday Event");
        System.out.println("2. Conference Event");
        int eventType = sc.nextInt();

        System.out.print("Enter venue cost: ");
        double venueCost = sc.nextDouble();

        System.out.print("Include catering/decoration? (1 = Yes, 0 = No): ");
        int services = sc.nextInt();

        double serviceCost = 0;
        if (services == 1) {
            System.out.print("Enter service cost: ");
            serviceCost = sc.nextDouble();
        }

        switch (eventType) {
            case 1:
                event = new BirthdayEvent(
                        eventName, location, date,
                        attendees, user,
                        venueCost, serviceCost
                );
                break;

            case 2:
                event = new ConferenceEvent(
                        eventName, location, date,
                        attendees, user,
                        venueCost, serviceCost
                );
                break;

            default:
                System.out.println("Invalid event type");
                System.exit(0);
        }

        System.out.println("\nChoose Action:");
        System.out.println("1. Schedule Event");
        System.out.println("2. Reschedule Event");
        System.out.println("3. Cancel Event");
        int action = sc.nextInt();
        sc.nextLine(); 
        
        switch (action) {
            case 1:
                event.schedule();
                break;

            case 2:
                System.out.print("Enter new date: ");
                String newDate = sc.nextLine();
                event.reschedule(newDate);
                break;

            case 3:
                event.cancel();
                break;

            default:
                System.out.println("Invalid action");
        }

        sc.close();
    }
}
