package com.petpal;

import java.util.Random;

public abstract class Pet implements IInteractable {

    protected String name;
    protected String type;
    protected int age;

    private int hunger; 
    private int energy; 
    private String mood;

    // Random default constructor
    public Pet(String name, String type) {
        this.name = name;
        this.type = type;
        this.age = new Random().nextInt(10) + 1;
        this.hunger = 50;
        this.energy = 50;
        updateMood();
    }

    // User-defined constructor
    public Pet(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.hunger = 50;
        this.energy = 50;
        updateMood();
    }

    protected void increaseEnergy(int value) {
        energy = Math.min(100, energy + value);
        updateMood();
    }

    protected void decreaseEnergy(int value) {
        energy = Math.max(0, energy - value);
        updateMood();
    }

    protected void decreaseHunger(int value) {
        hunger = Math.max(0, hunger - value);
        updateMood();
    }

    protected void increaseHunger(int value) {
        hunger = Math.min(100, hunger + value);
        updateMood();
    }

    private void updateMood() {
        if (energy > 60 && hunger < 40) {
            mood = "Happy";
        } else if (energy < 30) {
            mood = "Tired";
        } else {
            mood = "Normal";
        }
    }

    public String getMood() {
        return mood;
    }

    public abstract void makeSound();
}
