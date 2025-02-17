import org.junit.jupiter.api.Test;
import parsonalizedmealplangenerator.*;

public class ParsonalizeMealPlanGeneratorSystemTesing {
    @Test
    void mealPlanGeneratorTesting(){
        // Create meals
        Meal<VegetarianMeal> vegMealPlan = new Meal<>();
        vegMealPlan.addMeal(new VegetarianMeal("Grilled Vegetables"));
        vegMealPlan.addMeal(new VegetarianMeal("Paneer Curry"));
        Meal<VeganMeal> veganMealPlan = new Meal<>();
        veganMealPlan.addMeal(new VeganMeal("Tofu Stir Fry"));
        // Generate personalized meal plan
        MealPlanUtils.generatePlan(new VegetarianMeal("Vegetable Salad"));
        MealPlanUtils.generatePlan(new Keto("Grilled Chicken & Avocado"));
    }
}
