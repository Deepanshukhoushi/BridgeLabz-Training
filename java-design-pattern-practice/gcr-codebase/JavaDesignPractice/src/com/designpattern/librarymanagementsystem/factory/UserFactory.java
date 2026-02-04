package com.designpattern.librarymanagementsystem.factory;

public class UserFactory {

    public static User getUser(String role) {

        switch (role.toLowerCase()) {
            case "student":
                return new Student();
            case "faculty":
                return new Faculty();
            case "librarian":
                return new Librarian();
            default:
                throw new IllegalArgumentException("Invalid role entered");
        }
    }
}
