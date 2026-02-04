package com.designpattern.librarymanagementsystem.observer;

public class FacultyObserver implements Observer {
    private String name;

    public FacultyObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String bookName) {
        System.out.println("Faculty " + name + 
            " notified: New update for '" + bookName + "'");
    }
}
