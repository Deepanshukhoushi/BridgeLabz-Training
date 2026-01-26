package com.avltree.hospitalqueuemanagement;

import java.time.LocalTime;
import java.util.Scanner;

public class HospitalApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HospitalAVLTree queue = new HospitalAVLTree();
        int choice;

        do {
            System.out.println("\n--- Hospital Queue Management ---");
            System.out.println("1. Register Patient");
            System.out.println("2. Discharge Patient");
            System.out.println("3. Display Patient Queue");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    sc.nextLine();
                    System.out.print("Enter Arrival Time (HH:mm): ");
                    LocalTime time = LocalTime.parse(sc.nextLine());
                    System.out.print("Enter Patient Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Health Issue: ");
                    String issue = sc.nextLine();
                    queue.insert(new Patient(time, name, issue));
                    System.out.println("Patient registered.");
                    break;

                case 2:
                    sc.nextLine();
                    System.out.print("Enter Arrival Time to discharge (HH:mm): ");
                    LocalTime delTime = LocalTime.parse(sc.nextLine());
                    queue.delete(delTime);
                    System.out.println("Patient discharged.");
                    break;

                case 3:
                    queue.displayQueue();
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
