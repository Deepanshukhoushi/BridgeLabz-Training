package com.fittrack;

public abstract class Workout implements ITrackable {

    protected String type;
    protected int duration; // minutes
    protected int caloriesBurned;

    public Workout(String type, int duration) {
        this.type = type;
        this.duration = duration;
    }

    public abstract int calculateCalories();

    public int getCaloriesBurned() {
        return caloriesBurned;
    }

    @Override
    public void startWorkout() {
        System.out.println(type + " workout started.");
    }

    @Override
    public void stopWorkout() {
        System.out.println(type + " workout stopped.");
    }
}
