package com.gamebox;
import java.util.Scanner;
public class GameBoxApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        User user = new User(username);
        Game game;

        System.out.println("\nWelcome to GameBox");
        System.out.println("Select Game Type:");
        System.out.println("1. Arcade Game");
        System.out.println("2. Strategy Game");

        int choice = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter game title: ");
        String title = scanner.nextLine();

        System.out.print("Enter game price: ");
        double price = scanner.nextDouble();

        System.out.print("Enter game rating: ");
        double rating = scanner.nextDouble();

        if (choice == 1) {
            game = new ArcadeGame(title, price, rating);
        } else {
            game = new StrategyGame(title, price, rating);
        }

        while (true) {
            System.out.println("\n--- Game Menu ---");
            System.out.println("1. View Game Info");
            System.out.println("2. Play Demo");
            System.out.println("3. Apply Seasonal Discount");
            System.out.println("4. Buy & Download Game");
            System.out.println("5. View Owned Games");
            System.out.println("6. Exit");

            int option = scanner.nextInt();

            switch (option) {
                case 1 -> game.displayGameInfo();

                case 2 -> game.playDemo();

                case 3 -> {
                    System.out.print("Enter discount percentage: ");
                    double discount = scanner.nextDouble();
                    game.applyDiscount(discount);
                    System.out.println("Discount applied");
                }

                case 4 -> {
                    user.buyGame(game);
                    game.download();
                }

                case 5 -> user.showOwnedGames();

                case 6 -> {
                    System.out.println("Thank you for using GameBox!");
                    scanner.close();
                    return;
                }

                default -> System.out.println("Invalid option");
            }
        }
    }
}