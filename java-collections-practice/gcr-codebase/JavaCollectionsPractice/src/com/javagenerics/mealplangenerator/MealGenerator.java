package com.javagenerics.mealplangenerator;

class MealGenerator {

    public static <T extends MealPlan> Meal<T> generateMeal(
            String userName, T mealPlan) {

        if (userName == null || userName.isEmpty()) {
            throw new IllegalArgumentException("User name cannot be empty");
        }

        return new Meal<>(userName, mealPlan);
    }
}
