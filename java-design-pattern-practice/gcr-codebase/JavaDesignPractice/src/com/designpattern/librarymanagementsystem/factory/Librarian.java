package com.designpattern.librarymanagementsystem.factory;

public class Librarian implements User {
    public void showPrivileges() {
        System.out.println("Librarian: Manage books and inventory");
    }
}
