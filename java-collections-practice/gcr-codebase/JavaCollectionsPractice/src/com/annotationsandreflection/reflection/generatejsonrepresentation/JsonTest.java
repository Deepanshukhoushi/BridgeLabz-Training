package com.annotationsandreflection.reflection.generatejsonrepresentation;

public class JsonTest {
    public static void main(String[] args) {
        User user = new User(101, "Ravi", true);

        String json = JsonUtil.toJson(user);
        System.out.println(json);
    }
}
