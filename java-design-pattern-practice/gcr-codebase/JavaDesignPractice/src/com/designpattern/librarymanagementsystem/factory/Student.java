package com.designpattern.librarymanagementsystem.factory;

public class Student implements User {
    public void showPrivileges() {
        System.out.println("Student: Borrow books for limited days");
    }
}
