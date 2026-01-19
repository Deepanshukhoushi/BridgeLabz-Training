package com.bagnballorganizer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BagApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Bag> bags = new ArrayList<>();

        while (true) {
            System.out.println("\n Bag-n-Ball Organizer Menu");
            System.out.println("1. Create Bag");
            System.out.println("2. Add Ball to Bag");
            System.out.println("3. Remove Ball from Bag");
            System.out.println("4. Display Balls in a Bag");
            System.out.println("5. Display All Bags");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Bag ID: ");
                    String bagId = scanner.next();

                    System.out.print("Enter Bag Color: ");
                    String bagColor = scanner.next();

                    System.out.print("Enter Bag Capacity: ");
                    int capacity = scanner.nextInt();

                    bags.add(new Bag(bagId, bagColor, capacity));
                    System.out.println("Bag created.");
                    break;

                case 2:
                    Bag bagToAdd = findBag(scanner, bags);
                    if (bagToAdd != null) {
                        System.out.print("Enter Ball ID: ");
                        String ballId = scanner.next();

                        System.out.print("Enter Ball Color: ");
                        String ballColor = scanner.next();

                        System.out.print("Enter Ball Size (small/medium/large): ");
                        String size = scanner.next();

                        bagToAdd.addBall(new Ball(ballId, ballColor, size));
                    }
                    break;

                case 3:
                    Bag bagToRemove = findBag(scanner, bags);
                    if (bagToRemove != null) {
                        System.out.print("Enter Ball ID to remove: ");
                        String removeId = scanner.next();
                        bagToRemove.removeBall(removeId);
                    }
                    break;

                case 4:
                    Bag bagToDisplay = findBag(scanner, bags);
                    if (bagToDisplay != null) {
                        bagToDisplay.displayBalls();
                    }
                    break;

                case 5:
                    System.out.println("\n All Bags:");
                    for (Bag bag : bags) {
                        System.out.println(
                                "Bag ID: " + bag.getId() +
                                ", Color: " + bag.getColor() +
                                ", Ball Count: " + bag.getBallCount()
                        );
                    }
                    break;

                case 6:
                    System.out.println(" Exiting application.");
                    scanner.close();
                    return;

                default:
                    System.out.println(" Invalid choice.");
            }
        }
    }

    private static Bag findBag(Scanner scanner, List<Bag> bags) {
        System.out.print("Enter Bag ID: ");
        String id = scanner.next();

        for (Bag bag : bags) {
            if (bag.getId().equals(id)) {
                return bag;
            }
        }
        System.out.println(" Bag not found.");
        return null;
    }
}
