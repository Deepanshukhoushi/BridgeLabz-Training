package com.annotationsandreflection.annotations.markimportantmethods;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {

        Class<Service> clazz = Service.class;
        Method[] methods = clazz.getDeclaredMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(ImportantMethod.class)) {

                ImportantMethod annotation =
                        method.getAnnotation(ImportantMethod.class);

                System.out.println(
                    "Method: " + method.getName() +
                    ", Importance Level: " + annotation.level()
                );
            }
        }
    }
}
