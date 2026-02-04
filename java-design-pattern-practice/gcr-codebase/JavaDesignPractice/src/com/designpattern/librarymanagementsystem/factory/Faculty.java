package com.designpattern.librarymanagementsystem.factory;


public class Faculty implements User {
    public void showPrivileges() {
        System.out.println("Faculty: Extended borrowing privileges");
    }
}
