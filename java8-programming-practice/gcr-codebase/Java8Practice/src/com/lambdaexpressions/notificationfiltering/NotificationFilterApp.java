package com.lambdaexpressions.notificationfiltering;
import java.util.*;
import java.util.function.Predicate;

public class NotificationFilterApp {
    public static void main(String[] args) {

        List<Alert> alerts = Arrays.asList(
            new Alert("Heart rate critical", "EMERGENCY"),
            new Alert("Appointment reminder", "INFO"),
            new Alert("Blood test results available", "LAB_REPORT"),
            new Alert("Low oxygen level", "EMERGENCY"),
            new Alert("General health tips", "INFO")
        );

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose alert type to view:");
        System.out.println("1. Emergency Alerts");
        System.out.println("2. Info Alerts");
        System.out.println("3. Lab Report Alerts");

        int choice = sc.nextInt();

        Predicate<Alert> filter;

        switch (choice) {
            case 1:
                filter = alert -> alert.type.equals("EMERGENCY");
                break;

            case 2:
                filter = alert -> alert.type.equals("INFO");
                break;

            case 3:
                filter = alert -> alert.type.equals("LAB_REPORT");
                break;

            default:
                System.out.println("Invalid choice!");
                return;
        }

        System.out.println("\nFiltered Alerts:");
        alerts.stream()
              .filter(filter)
              .forEach(System.out::println);

        sc.close();
    }
}
