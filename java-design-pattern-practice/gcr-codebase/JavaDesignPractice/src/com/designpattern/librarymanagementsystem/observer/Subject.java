package com.designpattern.librarymanagementsystem.observer;

public interface Subject {
    void subscribe(Observer observer);
    void unsubscribe(Observer observer);
    void notifyObservers(String bookName);
}
