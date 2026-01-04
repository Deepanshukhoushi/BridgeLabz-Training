package com.linkedlist.singly.socialmediaconnections;
import java.util.Scanner;

public class SocialMediaApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SocialMediaList sm = new SocialMediaList();
        int choice;

        do {
            System.out.println("\n--- Social Media Friend Connections ---");
            System.out.println("1. Add User");
            System.out.println("2. Add Friend Connection");
            System.out.println("3. Remove Friend Connection");
            System.out.println("4. Display Friends of User");
            System.out.println("5. Find Mutual Friends");
            System.out.println("6. Search User by ID");
            System.out.println("7. Search User by Name");
            System.out.println("8. Count Friends of Each User");
            System.out.println("9. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1 -> {
                    System.out.print("Enter User ID: ");
                    int id = sc.nextInt();

                    System.out.print("Enter Name: ");
                    String name = sc.next();

                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();

                    sm.addUser(id, name, age);
                }

                case 2 -> {
                    System.out.print("Enter First User ID: ");
                    int id1 = sc.nextInt();

                    System.out.print("Enter Second User ID: ");
                    int id2 = sc.nextInt();

                    sm.addFriendConnection(id1, id2);
                }

                case 3 -> {
                    System.out.print("Enter First User ID: ");
                    int id1 = sc.nextInt();

                    System.out.print("Enter Second User ID: ");
                    int id2 = sc.nextInt();

                    sm.removeFriendConnection(id1, id2);
                }

                case 4 -> {
                    System.out.print("Enter User ID: ");
                    sm.displayFriends(sc.nextInt());
                }

                case 5 -> {
                    System.out.print("Enter First User ID: ");
                    int id1 = sc.nextInt();

                    System.out.print("Enter Second User ID: ");
                    int id2 = sc.nextInt();

                    sm.findMutualFriends(id1, id2);
                }

                case 6 -> {
                    System.out.print("Enter User ID: ");
                    sm.searchUserById(sc.nextInt());
                }

                case 7 -> {
                    System.out.print("Enter User Name: ");
                    sm.searchUserByName(sc.next());
                }

                case 8 -> sm.countFriends();

                case 9 -> System.out.println("Exiting...");

                default -> System.out.println("Invalid choice!");
            }

        } while (choice != 9);

        sc.close();
    }
}
