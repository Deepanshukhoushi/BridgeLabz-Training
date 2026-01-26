package com.avltree.gamingapp;

import java.util.Scanner;

public class GamingApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LeaderboardAVL leaderboard = new LeaderboardAVL();
        int choice;

        do {
            System.out.println("\n--- Gaming Leaderboard ---");
            System.out.println("1. Add / Update Player");
            System.out.println("2. Show Top 10 Players");
            System.out.println("3. Remove Player");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Player ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Player Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Score: ");
                    int score = sc.nextInt();
                    leaderboard.insert(new Player(id, name, score));
                    System.out.println("Player added/updated.");
                    break;

                case 2:
                    leaderboard.displayTopPlayers(10);
                    break;

                case 3:
                    System.out.print("Enter score to remove: ");
                    leaderboard.remove(sc.nextInt());
                    System.out.println("Player removed.");
                    break;

                case 4:
                    System.out.println("Exiting leaderboard...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 4);

        sc.close();
    }
}
