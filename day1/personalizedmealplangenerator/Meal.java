package org.week4.day1.personalizedmealplangenerator;
class Meal<T extends MealPlan> {
    private T meal;

    public Meal(T meal) {
        this.meal = meal;
    }

    public void generateMealPlan() {
        meal.displayMeal();
    }
}


