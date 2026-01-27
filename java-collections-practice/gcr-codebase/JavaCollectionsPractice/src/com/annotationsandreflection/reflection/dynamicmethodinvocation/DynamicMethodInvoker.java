package com.annotationsandreflection.reflection.dynamicmethodinvocation;

import java.lang.reflect.Method;
import java.util.Scanner;

public class DynamicMethodInvoker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter method name (add / subtract / multiply): ");
            String methodName = scanner.next();

            System.out.print("Enter first number: ");
            int a = scanner.nextInt();

            System.out.print("Enter second number: ");
            int b = scanner.nextInt();

            Class<?> clazz = MathOperations.class;
            Object object = clazz.getDeclaredConstructor().newInstance();

            Method method = clazz.getMethod(methodName, int.class, int.class);
            Object result = method.invoke(object, a, b);

            System.out.println("Result: " + result);

        } catch (NoSuchMethodException e) {
            System.out.println("Invalid method name!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
