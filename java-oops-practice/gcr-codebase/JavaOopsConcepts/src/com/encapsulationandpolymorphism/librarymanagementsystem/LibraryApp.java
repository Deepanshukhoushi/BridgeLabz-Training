package com.encapsulationandpolymorphism.librarymanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class LibraryApp {

    public static void main(String[] args) {

        List<LibraryItem> libraryItems = new ArrayList<>();

        LibraryItem book = new Book(1, "Clean Code", "Robert C. Martin");
        LibraryItem magazine = new Magazine(2, "Tech Today", "Editorial Team");
        LibraryItem dvd = new DVD(3, "Inception", "Christopher Nolan");

        libraryItems.add(book);
        libraryItems.add(magazine);
        libraryItems.add(dvd);

        ((Reservable) book).reserveItem("Amit");
        ((Reservable) dvd).reserveItem("Riya");

        LibraryManager.displayLibraryItems(libraryItems);
    }
}
