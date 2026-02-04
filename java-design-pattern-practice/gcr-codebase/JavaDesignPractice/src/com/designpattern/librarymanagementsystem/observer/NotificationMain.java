package com.designpattern.librarymanagementsystem.observer;

public class NotificationMain {
    public static void main(String[] args) {

        LibraryCatalog catalog = new LibraryCatalog();

        Observer s1 = new StudentObserver("Amit");
        Observer s2 = new StudentObserver("Neha");
        Observer f1 = new FacultyObserver("Dr. Sharma");

        catalog.subscribe(s1);
        catalog.subscribe(s2);
        catalog.subscribe(f1);

        catalog.addBook("Data Structures by Cormen");
    }
}
