package com.objectmodeling.librarymanagement;

import java.util.Scanner;

public class LibraryMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter library name: ");
        String libraryName = sc.nextLine();
        Library library = new Library(libraryName);

        Book book1 = new Book("The Alchemist", "Paulo Coelho");
        Book book2 = new Book("Clean Code", "Robert C. Martin");
        Book book3 = new Book("Effective Java", "Joshua Bloch");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.displayBooks();

        System.out.print("\nEnter book title to remove: ");
        String removeTitle = sc.nextLine();
        library.removeBook(removeTitle);

        library.displayBooks();

        sc.close();
    }
}
