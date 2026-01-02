package com.encapsulationandpolymorphism.librarymanagementsystem;

public class DVD extends LibraryItem implements Reservable {

    public DVD(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 3; // short duration
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (isAvailable()) {
            setBorrower(borrowerName);
            System.out.println("DVD reserved by " + borrowerName);
        } else {
            System.out.println("DVD is currently unavailable");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable();
    }
}