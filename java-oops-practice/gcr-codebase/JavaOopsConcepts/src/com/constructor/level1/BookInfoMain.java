package com.constructor.level1;

public class BookInfoMain {
	public static void main(String[] args) {

        BookInfo book = new BookInfo("Clean Code", "Robert C. Martin", 450.00);

        // Before borrowing
        book.displayBookDetails();

        // Borrow book
        book.borrowBook();

        // Try borrowing again
        book.borrowBook();

        // After borrowing
        book.displayBookDetails();
    }
}
