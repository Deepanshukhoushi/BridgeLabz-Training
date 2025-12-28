package com.constructor.level1;

public class BookMain {

    public static void main(String[] args) {

        // Default constructor
        Book book1 = new Book();
        book1.displayBookDetails();

        // Parameterized constructor
        Book book2 = new Book("Java Programming", "James Gosling", 499.99);
        book2.displayBookDetails();
    }
}