package com.javagenerics.mealplangenerator;

class Meal<T extends MealPlan> {

    private final String userName;
    private final T mealPlan;

    public Meal(String userName, T mealPlan) {
        this.userName = userName;
        this.mealPlan = mealPlan;
    }

    public T getMealPlan() {
        return mealPlan;
    }

    @Override
    public String toString() {
        return "User: " + userName +
               "\nMeal Type: " + mealPlan.getMealType() +
               "\nDescription: " + mealPlan.getDescription();
    }
}
