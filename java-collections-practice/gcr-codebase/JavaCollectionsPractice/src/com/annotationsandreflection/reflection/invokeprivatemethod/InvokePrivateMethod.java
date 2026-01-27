package com.annotationsandreflection.reflection.invokeprivatemethod;
import java.lang.reflect.Method;

public class InvokePrivateMethod {
    public static void main(String[] args) {

        try {
            Calculator calculator = new Calculator();

            Class<?> calculatorClass = calculator.getClass();

            Method multiplyMethod =
                    calculatorClass.getDeclaredMethod("multiply", int.class, int.class);

            multiplyMethod.setAccessible(true);

            Object result = multiplyMethod.invoke(calculator, 6, 7);

            System.out.println("Result (via Reflection): " + result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
