package com.linkedlist.circular.roundrobinschedular;

import java.util.Scanner;

public class RoundRobinScheduling {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Time Quantum: ");
        int timeQuantum = Integer.parseInt(sc.nextLine());

        RoundRobinScheduler scheduler = new RoundRobinScheduler(timeQuantum);
        int choice;

        do {
            System.out.println("\n--- Round Robin Scheduler ---");
            System.out.println("1. Add Process");
            System.out.println("2. Execute Scheduling");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                case 1 -> {
                    System.out.print("Process ID: ");
                    int id = Integer.parseInt(sc.nextLine());

                    System.out.print("Burst Time: ");
                    int burst = Integer.parseInt(sc.nextLine());

                    System.out.print("Priority: ");
                    int priority = Integer.parseInt(sc.nextLine());

                    scheduler.addProcess(id, burst, priority);
                }

                case 2 -> scheduler.execute();

                case 3 -> System.out.println("Exiting scheduler...");

                default -> System.out.println("Invalid choice!");
            }

        } while (choice != 3);

        sc.close();
    }
}
