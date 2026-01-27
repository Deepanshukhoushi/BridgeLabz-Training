package com.annotationsandreflection.reflection.accessandmodifystaticfields;

import java.lang.reflect.Field;

public class StaticFieldReflection {

    public static void main(String[] args) {

        try {
            Class<?> clazz = Configuration.class;

            Field apiKeyField = clazz.getDeclaredField("API_KEY");

            apiKeyField.setAccessible(true);

            apiKeyField.set(null, "NEW_SECRET_API_KEY");

            Configuration.printApiKey();

            String apiKeyValue = (String) apiKeyField.get(null);
            System.out.println("Retrieved via Reflection: " + apiKeyValue);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
