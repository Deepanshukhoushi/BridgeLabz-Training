/*
The Coffee Counter Chronicles
Ravi runs a café where customers order different types of coffee with specific quantities.
Write a Java program that asks the user for the coffee type using switch, accepts quantity, calculates the total bill using price multiplied by quantity, adds GST using arithmetic operators, and continues serving customers using a while loop. The program should stop when the user types “exit”.
*/

import java.util.Scanner;
public class CoffeeCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double GST_RATE = 0.05; 

        while (true) {
            System.out.print("\nEnter coffee type (Espresso / Latte / Cappuccino) or type 'exit' to stop: ");
            String coffeeType = sc.next();

            // Stop condition
            if (coffeeType.equalsIgnoreCase("exit")) {
                System.out.println("Thank you! Cafe closed ");
                break;
            }

            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();

            if (quantity <= 0) {
                System.out.println("Quantity must be greater than zero.");
                continue;
            }

            double pricePerCup;

            switch (coffeeType.toLowerCase()) {
                case "espresso":
                    pricePerCup = 120;
                    break;
                case "latte":
                    pricePerCup = 150;
                    break;
                case "cappuccino":
                    pricePerCup = 180;
                    break;
                default:
                    System.out.println("Invalid coffee type!");
                    continue;
            }

            double total = pricePerCup * quantity;
            double gst = total * GST_RATE;
            double finalBill = total + gst;

            System.out.println("\n----- BILL DETAILS -----");
            System.out.println("Coffee Type : " + coffeeType);
            System.out.println("Quantity    : " + quantity);
            System.out.printf("Base Amount : %.2f%n", total);
            System.out.printf("GST (5%%)    : %.2f%n", gst);
            System.out.printf("Total Bill  : %.2f%n", finalBill);
            System.out.println("------------------------");
        }

        sc.close();
    }
}
