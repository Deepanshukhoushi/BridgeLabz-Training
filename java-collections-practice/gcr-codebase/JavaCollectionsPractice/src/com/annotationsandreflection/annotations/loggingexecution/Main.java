package com.annotationsandreflection.annotations.loggingexecution;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {

        PerformanceService service = new PerformanceService();
        Method[] methods = PerformanceService.class.getDeclaredMethods();

        for (Method method : methods) {

            if (method.isAnnotationPresent(LogExecutionTime.class)) {

                long startTime = System.nanoTime();

                method.invoke(service);   

                long endTime = System.nanoTime();

                long executionTime = endTime - startTime;

                System.out.println(
                    "Method: " + method.getName() +
                    " | Execution Time: " + executionTime + " ns"
                );
            }
        }
    }
}
