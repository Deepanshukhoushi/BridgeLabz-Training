package com.linkedlist.doubly.librarymanagementsystem;

import java.util.Scanner;

public class LibraryManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LibraryDoublyLinkedList library = new LibraryDoublyLinkedList();
        int choice;

        do {
            System.out.println("\n--- Library Management System ---");
            System.out.println("1. Add Book (Beginning)");
            System.out.println("2. Add Book (End)");
            System.out.println("3. Add Book (Position)");
            System.out.println("4. Remove Book by ID");
            System.out.println("5. Search by Title");
            System.out.println("6. Search by Author");
            System.out.println("7. Update Availability");
            System.out.println("8. Display Forward");
            System.out.println("9. Display Reverse");
            System.out.println("10. Count Books");
            System.out.println("11. Exit");
            System.out.print("Enter choice: ");

            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                case 1 -> {
                    System.out.print("Book ID: ");
                    int id = Integer.parseInt(sc.nextLine());

                    System.out.print("Title: ");
                    String title = sc.nextLine();

                    System.out.print("Author: ");
                    String author = sc.nextLine();

                    System.out.print("Genre: ");
                    String genre = sc.nextLine();

                    System.out.print("Available (true/false): ");
                    boolean available = Boolean.parseBoolean(sc.nextLine());

                    library.addAtBeginning(id, title, author, genre, available);
                }

                case 2 -> {
                    System.out.print("Book ID: ");
                    int id = Integer.parseInt(sc.nextLine());

                    System.out.print("Title: ");
                    String title = sc.nextLine();

                    System.out.print("Author: ");
                    String author = sc.nextLine();

                    System.out.print("Genre: ");
                    String genre = sc.nextLine();

                    System.out.print("Available (true/false): ");
                    boolean available = Boolean.parseBoolean(sc.nextLine());

                    library.addAtEnd(id, title, author, genre, available);
                }

                case 3 -> {
                    System.out.print("Position: ");
                    int pos = Integer.parseInt(sc.nextLine());

                    System.out.print("Book ID: ");
                    int id = Integer.parseInt(sc.nextLine());

                    System.out.print("Title: ");
                    String title = sc.nextLine();

                    System.out.print("Author: ");
                    String author = sc.nextLine();

                    System.out.print("Genre: ");
                    String genre = sc.nextLine();

                    System.out.print("Available (true/false): ");
                    boolean available = Boolean.parseBoolean(sc.nextLine());

                    library.addAtPosition(pos, id, title, author, genre, available);
                }

                case 4 -> {
                    System.out.print("Enter Book ID: ");
                    library.removeById(Integer.parseInt(sc.nextLine()));
                }

                case 5 -> {
                    System.out.print("Enter Book Title: ");
                    library.searchByTitle(sc.nextLine());
                }

                case 6 -> {
                    System.out.print("Enter Author Name: ");
                    library.searchByAuthor(sc.nextLine());
                }

                case 7 -> {
                    System.out.print("Enter Book ID: ");
                    int id = Integer.parseInt(sc.nextLine());

                    System.out.print("Available (true/false): ");
                    boolean status = Boolean.parseBoolean(sc.nextLine());

                    library.updateAvailability(id, status);
                }

                case 8 -> library.displayForward();
                case 9 -> library.displayReverse();
                case 10 -> library.countBooks();
                case 11 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice!");
            }

        } while (choice != 11);

        sc.close();
    }
}

