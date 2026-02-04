package com.designpattern.librarymanagementsystem.observer;

public class StudentObserver implements Observer {
    private String name;

    public StudentObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String bookName) {
        System.out.println("Student " + name + 
            " notified: '" + bookName + "' is now available");
    }
}
