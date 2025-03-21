package personalised_meal_plan_generator;

public class Meal <T extends MealPlan>{
    // Attribute
    private T mealType;

    // Constructor
    public Meal(T mealType){
        this.mealType = mealType;
    }

    // Method to display the meal
    public void showMeal(){
        mealType.displayMeal();
    }

    // Generic method to create and return a meal
    public static <T extends MealPlan> void generateMeal(T meal){
        meal.displayMeal();
    } 
}
