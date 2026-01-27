package com.annotationsandreflection.reflection.accessprivatefield;

import java.lang.reflect.Field;

public class AccessFields {
    public static void main(String[] args) {

        try {
            // Create Person object
            Person person = new Person();

            // Get Class object
            Class<?> personClass = person.getClass();

            // Get private field 'age'
            Field ageField = personClass.getDeclaredField("age");

            // Allow access to private field
            ageField.setAccessible(true);

            // Set value using reflection
            ageField.setInt(person, 25);

            // Get value using reflection
            int ageValue = ageField.getInt(person);

            System.out.println("Age value (via Reflection): " + ageValue);

        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}

