package com.petpal;

public class Dog extends Pet {

    public Dog(String name) {
        super(name, "Dog");
    }

    @Override
    public void feed() {
        decreaseHunger(30);
    }

    @Override
    public void play() {
        decreaseEnergy(20);
        increaseHunger(15);
    }

    @Override
    public void sleep() {
        increaseEnergy(30);
    }

    @Override
    public void makeSound() {
        System.out.println("Dog says: Woof!");
    }
}
