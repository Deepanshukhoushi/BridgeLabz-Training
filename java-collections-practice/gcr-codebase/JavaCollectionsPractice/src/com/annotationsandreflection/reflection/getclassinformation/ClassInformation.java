package com.annotationsandreflection.reflection.getclassinformation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class ClassInformation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter full class name: ");
        String className = scanner.nextLine();

        try {
            Class<?> clazz = Class.forName(className);

            System.out.println("\n=== Class Name ===");
            System.out.println(clazz.getName());

            System.out.println("\n=== Constructors ===");
            Constructor<?>[] constructors = clazz.getDeclaredConstructors();
            for (Constructor<?> constructor : constructors) {
                System.out.println(constructor);
            }

            System.out.println("\n=== Fields ===");
            Field[] fields = clazz.getDeclaredFields();
            for (Field field : fields) {
                System.out.println(field);
            }

            System.out.println("\n=== Methods ===");
            Method[] methods = clazz.getDeclaredMethods();
            for (Method method : methods) {
                System.out.println(method);
            }

        } catch (ClassNotFoundException e) {
            System.out.println("Class not found! Please enter a valid class name.");
        }

        scanner.close();
    }
}
