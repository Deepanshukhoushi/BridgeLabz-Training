package com.annotationsandreflection.reflection.accessandmodifystaticfields;

public class Configuration {

    private static String API_KEY = "DEFAULT_KEY";

    public static void printApiKey() {
        System.out.println("API_KEY: " + API_KEY);
    }
}
