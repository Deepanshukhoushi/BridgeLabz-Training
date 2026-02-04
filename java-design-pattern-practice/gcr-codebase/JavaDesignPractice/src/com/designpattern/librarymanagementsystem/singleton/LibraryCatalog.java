package com.designpattern.librarymanagementsystem.singleton;

public class LibraryCatalog {

    private static LibraryCatalog instance;

    private LibraryCatalog() {
        System.out.println("Library Catalog Initialized");
    }

    public static synchronized LibraryCatalog getInstance() {
        if (instance == null) {
            instance = new LibraryCatalog();
        }
        return instance;
    }

    public void displayCatalog() {
        System.out.println("Displaying all books in the library");
    }
}
