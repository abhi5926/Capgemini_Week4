package parsonalizedmealplangenerator;

import java.util.ArrayList;
import java.util.List;

public class Meal<T extends MealPlan> {
public List<T> meals = new ArrayList<>();

// Method to add Meals
    public void addMeal(T meal){
        meals.add(meal);
    }
    // Method to return meal list
    public List<T> getMeals(){
        return meals;
    }
}
