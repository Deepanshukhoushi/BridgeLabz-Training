package com.objectmodeling.librarymanagement;

import java.util.ArrayList;
import java.util.List;

class Library {
    private String name;
    private List<Book> books;

    public Library(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Library name cannot be empty.");
        }
        this.name = name.trim();
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        if (book == null) {
            System.out.println("Cannot add a null book.");
            return;
        }
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    public void removeBook(String title) {
        if (title == null || title.trim().isEmpty()) {
            System.out.println("Invalid title.");
            return;
        }
        boolean removed = books.removeIf(b -> b.getTitle().equalsIgnoreCase(title.trim()));
        if (removed) {
            System.out.println("Book removed: " + title);
        } else {
            System.out.println("Book not found: " + title);
        }
    }

    public void displayBooks() {
        System.out.println("\nLibrary: " + name);
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            for (Book b : books) {
                b.displayInfo();
            }
        }
    }
}
