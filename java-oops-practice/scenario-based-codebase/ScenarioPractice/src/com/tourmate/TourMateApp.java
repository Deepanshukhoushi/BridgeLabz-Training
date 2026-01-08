package com.tourmate;

import java.util.Scanner;

public class TourMateApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Trip Type:");
        System.out.println("1. Domestic Trip");
        System.out.println("2. International Trip");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter destination: ");
        String destination = sc.nextLine();

        System.out.print("Enter duration (days): ");
        int duration = sc.nextInt();

        System.out.print("Enter transport cost: ");
        double transportCost = sc.nextDouble();

        System.out.print("Enter hotel cost: ");
        double hotelCost = sc.nextDouble();

        System.out.print("Enter activity cost: ");
        double activityCost = sc.nextDouble();

        Transport transport = new Transport(transportCost);
        Hotel hotel = new Hotel(hotelCost);
        Activity activity = new Activity(activityCost);

        Trip trip;

        if (choice == 1) {
            trip = new DomesticTrip(destination, duration, transport, hotel, activity);
        } else {
            trip = new InternationalTrip(destination, duration, transport, hotel, activity);
        }

        trip.showTripDetails();
        trip.book();

        sc.close();
    }
}
