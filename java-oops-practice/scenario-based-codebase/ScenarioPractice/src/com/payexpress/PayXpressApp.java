package com.payexpress;
import java.time.LocalDate;
import java.util.Scanner;
public class PayXpressApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bill bill = null;

        System.out.println("=== Welcome to PayXpress ===");
        System.out.println("Select Bill Type:");
        System.out.println("1. Electricity");
        System.out.println("2. Water");
        System.out.println("3. Internet");

        int choice = sc.nextInt();

        System.out.print("Enter Bill Amount: ");
        double amount = sc.nextDouble();

        System.out.print("Enter Due Date (YYYY-MM-DD): ");
        LocalDate dueDate = LocalDate.parse(sc.next());

        switch (choice) {
            case 1:
                bill = new ElectricityBill(amount, dueDate);
                break;
            case 2:
                bill = new WaterBill(amount, dueDate);
                break;
            case 3:
                bill = new InternetBill(amount, dueDate);
                break;
            default:
                System.out.println("Invalid choice");
                System.exit(0);
        }

        System.out.println("\n1. View Reminder");
        System.out.println("2. Pay Bill");
        System.out.print("Choose option: ");
        int action = sc.nextInt();

        if (action == 1) {
            bill.sendReminder();
        } else if (action == 2) {
            bill.pay();
        }

        sc.close();
    }
}
