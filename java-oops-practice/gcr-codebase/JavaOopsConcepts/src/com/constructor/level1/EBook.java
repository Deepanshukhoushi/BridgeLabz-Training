package com.constructor.level1;

public class EBook extends BookLibrary {

    private double fileSize; // in MB

    public EBook(String ISBN, String title,
                 String author, double fileSize) {
        super(ISBN, title, author);
        this.fileSize = fileSize;
    }

    // Accessing public & protected members
    public void displayEBookDetails() {
        System.out.println("ISBN     : " + ISBN);     // public
        System.out.println("Title    : " + title);    // protected
        System.out.println("Author   : " + getAuthor());
        System.out.println("FileSize : " + fileSize + " MB");
        System.out.println();
    }
}
