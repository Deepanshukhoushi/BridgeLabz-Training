package com.encapsulationandpolymorphism.librarymanagementsystem;

import java.util.List;

public class LibraryManager {

    public static void displayLibraryItems(List<LibraryItem> items) {

        for (LibraryItem item : items) {

            item.getItemDetails();

            if (item instanceof Reservable) {
                System.out.println("Available: " +
                        (((Reservable) item).checkAvailability() ? "Yes" : "No"));
            }

            System.out.println("----------------------------------");
        }
    }
}

