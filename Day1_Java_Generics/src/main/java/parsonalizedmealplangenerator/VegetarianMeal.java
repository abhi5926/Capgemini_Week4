package parsonalizedmealplangenerator;

public class VegetarianMeal implements MealPlan {
    private String mealName;

    // Creating Constructor
    public VegetarianMeal(String meal){
        this.mealName = meal;
    }

    // Method to get MealName
    public String getMealName(){
        return mealName;
    }
}
