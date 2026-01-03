package com.linkedlist.singly.studentrecordmanagement;
import java.util.Scanner;
public class StudentRecordManagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentLinkedList list = new StudentLinkedList();
        int choice;

        do {
            System.out.println("\n--- Student Record Management ---");
            System.out.println("1. Add at Beginning");
            System.out.println("2. Add at End");
            System.out.println("3. Add at Position");
            System.out.println("4. Delete by Roll Number");
            System.out.println("5. Search by Roll Number");
            System.out.println("6. Update Grade");
            System.out.println("7. Display All");
            System.out.println("8. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Roll, Name, Age, Grade: ");
                    list.addAtBeginning(sc.nextInt(), sc.next(), sc.nextInt(), sc.next().charAt(0));
                }
                case 2 -> {
                    System.out.print("Roll, Name, Age, Grade: ");
                    list.addAtEnd(sc.nextInt(), sc.next(), sc.nextInt(), sc.next().charAt(0));
                }
                case 3 -> {
                    System.out.print("Position, Roll, Name, Age, Grade: ");
                    list.addAtPosition(sc.nextInt(), sc.nextInt(), sc.next(), sc.nextInt(), sc.next().charAt(0));
                }
                case 4 -> {
                    System.out.print("Enter Roll Number: ");
                    list.deleteByRoll(sc.nextInt());
                }
                case 5 -> {
                    System.out.print("Enter Roll Number: ");
                    list.searchByRoll(sc.nextInt());
                }
                case 6 -> {
                    System.out.print("Enter Roll Number and New Grade: ");
                    list.updateGrade(sc.nextInt(), sc.next().charAt(0));
                }
                case 7 -> list.displayAll();
                case 8 -> System.out.println("Exiting program...");
                default -> System.out.println("Invalid choice!");
            }

        } while (choice != 8);

        sc.close();
    }
}