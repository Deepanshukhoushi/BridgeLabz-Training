package com.annotationsandreflection.reflection.accessprivatefield;

public class Person {

    private int age;

    public Person(int age) {
        this.age = age;
    }

    public Person() {
        
    }
    public int getAge() {
    	return age;
    }
}
