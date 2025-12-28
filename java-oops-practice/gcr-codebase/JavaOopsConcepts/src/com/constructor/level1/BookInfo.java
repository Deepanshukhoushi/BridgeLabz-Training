package com.constructor.level1;

public class BookInfo {

    private String title;
    private String author;
    private double price;
    private boolean availability;

    // Parameterized constructor
    public BookInfo(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = true; // initially available
    }

    // Method to borrow a book
    public void borrowBook() {
        if (availability) {
            availability = false;
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Sorry, book is not available.");
        }
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("Title        : " + title);
        System.out.println("Author       : " + author);
        System.out.println("Price        : ₹" + price);
        System.out.println("Availability : " +
                (availability ? "Available" : "Not Available"));
        System.out.println();
    }
}
