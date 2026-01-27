package com.annotationsandreflection.reflection.customobjectmapper;

public class User {

    private int id;
    private String name;
    private String email;

    public void display() {
        System.out.println(id + " | " + name + " | " + email);
    }
}
