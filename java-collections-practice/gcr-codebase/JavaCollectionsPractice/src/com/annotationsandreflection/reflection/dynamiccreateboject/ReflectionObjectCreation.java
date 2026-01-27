package com.annotationsandreflection.reflection.dynamiccreateboject;

public class ReflectionObjectCreation {
    public static void main(String[] args) {
        try {
            Class<?> studentClass = Class.forName("Student");

            Object studentObj = studentClass.getDeclaredConstructor().newInstance();

            Student student = (Student) studentObj;

            student.display();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

