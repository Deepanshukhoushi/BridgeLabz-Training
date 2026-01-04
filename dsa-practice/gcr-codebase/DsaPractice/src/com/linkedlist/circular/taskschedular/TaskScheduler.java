package com.linkedlist.circular.taskschedular;

import java.util.Scanner;

public class TaskScheduler {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TaskCircularLinkedList scheduler = new TaskCircularLinkedList();
        int choice;

        do {
            System.out.println("\n--- Task Scheduler ---");
            System.out.println("1. Add Task (Beginning)");
            System.out.println("2. Add Task (End)");
            System.out.println("3. Add Task (Position)");
            System.out.println("4. Remove Task by ID");
            System.out.println("5. View Current Task & Move Next");
            System.out.println("6. Display All Tasks");
            System.out.println("7. Search Task by Priority");
            System.out.println("8. Exit");
            System.out.print("Enter choice: ");

            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                case 1 -> {
                    System.out.print("Task ID: ");
                    int id = Integer.parseInt(sc.nextLine());

                    System.out.print("Task Name: ");
                    String name = sc.nextLine();

                    System.out.print("Priority: ");
                    int priority = Integer.parseInt(sc.nextLine());

                    System.out.print("Due Date: ");
                    String date = sc.nextLine();

                    scheduler.addAtBeginning(id, name, priority, date);
                }

                case 2 -> {
                    System.out.print("Task ID: ");
                    int id = Integer.parseInt(sc.nextLine());

                    System.out.print("Task Name: ");
                    String name = sc.nextLine();

                    System.out.print("Priority: ");
                    int priority = Integer.parseInt(sc.nextLine());

                    System.out.print("Due Date: ");
                    String date = sc.nextLine();

                    scheduler.addAtEnd(id, name, priority, date);
                }

                case 3 -> {
                    System.out.print("Position: ");
                    int pos = Integer.parseInt(sc.nextLine());

                    System.out.print("Task ID: ");
                    int id = Integer.parseInt(sc.nextLine());

                    System.out.print("Task Name: ");
                    String name = sc.nextLine();

                    System.out.print("Priority: ");
                    int priority = Integer.parseInt(sc.nextLine());

                    System.out.print("Due Date: ");
                    String date = sc.nextLine();

                    scheduler.addAtPosition(pos, id, name, priority, date);
                }

                case 4 -> {
                    System.out.print("Enter Task ID: ");
                    scheduler.removeById(Integer.parseInt(sc.nextLine()));
                }

                case 5 -> scheduler.viewNextTask();

                case 6 -> scheduler.displayAll();

                case 7 -> {
                    System.out.print("Enter Priority: ");
                    scheduler.searchByPriority(Integer.parseInt(sc.nextLine()));
                }

                case 8 -> System.out.println("Exiting scheduler...");
                default -> System.out.println("Invalid choice!");
            }

        } while (choice != 8);

        sc.close();
    }
}
