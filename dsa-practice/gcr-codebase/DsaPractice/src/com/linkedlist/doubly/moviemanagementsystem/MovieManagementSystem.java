package com.linkedlist.doubly.moviemanagementsystem;

import java.util.Scanner;

public class MovieManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MovieDoublyLinkedList list = new MovieDoublyLinkedList();
        int choice;

        do {
            System.out.println("\n--- Movie Management System ---");
            System.out.println("1. Add Movie (Beginning)");
            System.out.println("2. Add Movie (End)");
            System.out.println("3. Add Movie (Position)");
            System.out.println("4. Remove Movie by Title");
            System.out.println("5. Search by Director");
            System.out.println("6. Search by Rating");
            System.out.println("7. Display Forward");
            System.out.println("8. Display Reverse");
            System.out.println("9. Update Rating");
            System.out.println("10. Exit");
            System.out.print("Enter choice: ");

            choice = Integer.parseInt(sc.nextLine()); // SAFE

            switch (choice) {

                case 1 -> {
                    System.out.print("Enter Movie Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Director Name: ");
                    String director = sc.nextLine();

                    System.out.print("Enter Year of Release: ");
                    int year = Integer.parseInt(sc.nextLine());

                    System.out.print("Enter Rating: ");
                    double rating = Double.parseDouble(sc.nextLine());

                    list.addAtBeginning(title, director, year, rating);
                }

                case 2 -> {
                    System.out.print("Enter Movie Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Director Name: ");
                    String director = sc.nextLine();

                    System.out.print("Enter Year of Release: ");
                    int year = Integer.parseInt(sc.nextLine());

                    System.out.print("Enter Rating: ");
                    double rating = Double.parseDouble(sc.nextLine());

                    list.addAtEnd(title, director, year, rating);
                }

                case 3 -> {
                    System.out.print("Enter Position: ");
                    int pos = Integer.parseInt(sc.nextLine());

                    System.out.print("Enter Movie Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Director Name: ");
                    String director = sc.nextLine();

                    System.out.print("Enter Year of Release: ");
                    int year = Integer.parseInt(sc.nextLine());

                    System.out.print("Enter Rating: ");
                    double rating = Double.parseDouble(sc.nextLine());

                    list.addAtPosition(pos, title, director, year, rating);
                }

                case 4 -> {
                    System.out.print("Enter Movie Title: ");
                    list.removeByTitle(sc.nextLine());
                }

                case 5 -> {
                    System.out.print("Enter Director Name: ");
                    list.searchByDirector(sc.nextLine());
                }

                case 6 -> {
                    System.out.print("Enter Minimum Rating: ");
                    list.searchByRating(Double.parseDouble(sc.nextLine()));
                }

                case 7 -> list.displayForward();

                case 8 -> list.displayReverse();

                case 9 -> {
                    System.out.print("Enter Movie Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter New Rating: ");
                    double rating = Double.parseDouble(sc.nextLine());

                    list.updateRating(title, rating);
                }

                case 10 -> System.out.println("Exiting...");

                default -> System.out.println("Invalid choice!");
            }

        } while (choice != 10);

        sc.close();
    }
}
