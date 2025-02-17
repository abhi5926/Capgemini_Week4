package parsonalizedmealplangenerator;

public class VeganMeal implements MealPlan {
    private String mealName;

    // Creating Constructor
    public VeganMeal(String name){
        this.mealName = name;
    }

    // getter method to get Meal Name
    public String getMealName(){
        return mealName;
    }
}
