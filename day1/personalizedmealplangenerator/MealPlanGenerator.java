package org.week4.day1.personalizedmealplangenerator;
class MealPlanGenerator {
    public static <T extends MealPlan> Meal<T> createMealPlan(T meal) {
        return new Meal<>(meal);
    }
}