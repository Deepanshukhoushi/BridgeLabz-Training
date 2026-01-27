package com.annotationsandreflection.reflection.methodexecutiontiming;

import java.lang.reflect.Method;

public class MethodExecutionTimer {

    public static void main(String[] args) {

        try {
            Class<?> clazz = TaskService.class;
            Object obj = clazz.getDeclaredConstructor().newInstance();

            for (Method method : clazz.getDeclaredMethods()) {

                long startTime = System.nanoTime();

                method.invoke(obj);

                long endTime = System.nanoTime();

                long duration = endTime - startTime;

                System.out.println(
                        "Method: " + method.getName()
                        + " | Time taken: " + duration + " ns"
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
