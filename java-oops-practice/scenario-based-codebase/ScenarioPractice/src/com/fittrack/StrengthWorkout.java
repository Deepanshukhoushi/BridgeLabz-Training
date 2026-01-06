package com.fittrack;

public class StrengthWorkout extends Workout {

    public StrengthWorkout(int duration) {
        super("Strength", duration);
    }

    @Override
    public int calculateCalories() {
        caloriesBurned = duration * 6;
        return caloriesBurned;
    }
}
