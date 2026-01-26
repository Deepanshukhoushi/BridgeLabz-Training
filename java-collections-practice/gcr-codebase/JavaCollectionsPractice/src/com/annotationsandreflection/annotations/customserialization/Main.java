package com.annotationsandreflection.annotations.customserialization;

public class Main {
    public static void main(String[] args) {

        User user = new User("Deepanshu", 22, "secret123");

        String json = JsonSerializer.toJson(user);
        System.out.println(json);
    }
}
