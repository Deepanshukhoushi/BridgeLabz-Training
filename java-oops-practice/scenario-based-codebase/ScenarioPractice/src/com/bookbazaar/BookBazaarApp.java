package com.bookbazaar;

import java.util.Scanner;

public class BookBazaarApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter User Name: ");
        String user = sc.nextLine();

        Order order = new Order(user);

        System.out.print("Choose Book Type (1-EBook, 2-Printed): ");
        int type = sc.nextInt();

        sc.nextLine();
        System.out.print("Enter Title: ");
        String title = sc.nextLine();

        System.out.print("Enter Author: ");
        String author = sc.nextLine();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        Book book;

        if (type == 1) {
            book = new EBook(title, author, price);
        } else {
            System.out.print("Enter Stock: ");
            int stock = sc.nextInt();
            book = new PrintedBook(title, author, price, stock);
        }

        order.addBook(book, quantity);

        System.out.println("\n Order Placed Successfully");
        System.out.println("Total Amount: " + order.getTotalAmount());
        System.out.println("Order Status: " + order.getStatus());

        sc.close();
    }
}
