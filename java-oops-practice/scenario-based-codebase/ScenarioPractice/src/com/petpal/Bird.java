package com.petpal;

public class Bird extends Pet {

    public Bird(String name) {
        super(name, "Bird");
    }

    @Override
    public void feed() {
        decreaseHunger(20);
    }

    @Override
    public void play() {
        decreaseEnergy(10);
        increaseHunger(5);
    }

    @Override
    public void sleep() {
        increaseEnergy(20);
    }

    @Override
    public void makeSound() {
        System.out.println("Bird says: Tweet!");
    }
}
