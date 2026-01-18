package com.javagenerics.mealplangenerator;

class VegetarianMeal implements MealPlan {
    public String getMealType() {
        return "Vegetarian";
    }

    public String getDescription() {
        return "Includes vegetables, grains, dairy";
    }
}

class VeganMeal implements MealPlan {
    public String getMealType() {
        return "Vegan";
    }

    public String getDescription() {
        return "Plant-based, no animal products";
    }
}

class KetoMeal implements MealPlan {
    public String getMealType() {
        return "Keto";
    }

    public String getDescription() {
        return "Low-carb, high-fat diet";
    }
}

class HighProteinMeal implements MealPlan {
    public String getMealType() {
        return "High Protein";
    }

    public String getDescription() {
        return "Protein-rich meals for muscle growth";
    }
}
