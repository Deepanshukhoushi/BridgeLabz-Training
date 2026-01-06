package com.fittrack;

public class UserProfile {

    private String name;
    private int age;
    private double weight; 
    private String goal;
    private int dailyCalorieTarget;

    // Default goal constructor
    public UserProfile(String name, int age, double weight) {
        this(name, age, weight, "Stay Fit");
    }

    // Custom goal constructor
    public UserProfile(String name, int age, double weight, String goal) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.goal = goal;
        this.dailyCalorieTarget = 2000;
    }

    public double getWeight() {
        return weight;
    }

    public int calculateProgress(int caloriesBurned) {
        return dailyCalorieTarget - caloriesBurned;
    }
}
