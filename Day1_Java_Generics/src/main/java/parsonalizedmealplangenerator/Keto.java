package parsonalizedmealplangenerator;

public class Keto implements MealPlan {
    // Attribute
    private String mealName;

    // Creating Constructor
    public Keto(String name){
        this.mealName = name;
    }
    // Method to get Keto Meal Name
    public String getMealName(){
        return mealName;
    }
}
