package com.constructor.level1;

public class LibraryMain {

    public static void main(String[] args) {

        BookLibrary book =
                new BookLibrary("978-0132350884",
                                "Clean Code",
                                "Robert C. Martin");
        book.displayBookDetails();

        // Modify author using setter
        book.setAuthor("Uncle Bob");
        System.out.println("Updated Author: " + book.getAuthor());
        System.out.println();

        EBook ebook =
                new EBook("978-0201633610",
                          "Design Patterns",
                          "Erich Gamma",
                          5.2);
        ebook.displayEBookDetails();
    }
}
