package com.petpal;

public class Cat extends Pet {

    public Cat(String name) {
        super(name, "Cat");
    }

    @Override
    public void feed() {
        decreaseHunger(25);
    }

    @Override
    public void play() {
        decreaseEnergy(15);
        increaseHunger(10);
    }

    @Override
    public void sleep() {
        increaseEnergy(40);
    }

    @Override
    public void makeSound() {
        System.out.println("Cat says: Meow!");
    }
}
