package com.encapsulationandpolymorphism.librarymanagementsystem;

public abstract class LibraryItem {

    private int itemId;
    private String title;
    private String author;

    // Encapsulated borrower details
    private String borrowerName;
    private boolean isAvailable = true;

    protected LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    // Encapsulation: getters
    public int getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    protected void setBorrower(String borrowerName) {
        this.borrowerName = borrowerName;
        this.isAvailable = false;
    }

    protected void clearBorrower() {
        this.borrowerName = null;
        this.isAvailable = true;
    }

    protected boolean isAvailable() {
        return isAvailable;
    }

    // Abstract method
    public abstract int getLoanDuration();

    // Concrete method
    public void getItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Loan Duration: " + getLoanDuration() + " days");
    }
}
