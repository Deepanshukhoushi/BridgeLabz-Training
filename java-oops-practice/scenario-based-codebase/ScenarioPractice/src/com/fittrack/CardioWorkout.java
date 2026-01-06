package com.fittrack;

public class CardioWorkout extends Workout {

    public CardioWorkout(int duration) {
        super("Cardio", duration);
    }

    @Override
    public int calculateCalories() {
        caloriesBurned = duration * 8;
        return caloriesBurned;
    }
}
