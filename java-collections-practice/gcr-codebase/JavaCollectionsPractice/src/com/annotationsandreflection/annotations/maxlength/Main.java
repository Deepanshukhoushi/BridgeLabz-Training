package com.annotationsandreflection.annotations.maxlength;

public class Main {
    public static void main(String[] args) {

        User user1 = new User("Deepanshu");
        System.out.println("User created: " + user1.getUsername());

        User user2 = new User("VeryLongUsername123");
    }
}
