package personalised_meal_plan_generator;

public class Main {
    public static void main(String[] args) {
        // Creating meal instances
        VegetarianMeal vegMeal = new VegetarianMeal();
        VeganMeal veganMeal = new VeganMeal();
        Keto ketoMeal = new Keto();
        HighProtein proteinMeal = new HighProtein();

        // Using generic class to handle meals
        Meal<VegetarianMeal> vegeMeal = new Meal(vegMeal);
        Meal<VeganMeal> vMeal = new Meal<>(veganMeal);
        Meal<Keto> kMeal = new Meal<>(ketoMeal);
        Meal<HighProtein> hpMeal = new Meal<>(proteinMeal);

        // Displaying meals using generic class
        System.out.println("Personalized Meal Plan:");
        vegeMeal.showMeal();
        vMeal.showMeal();
        kMeal.showMeal();
        hpMeal.showMeal();

        // Using generic method for meal generation
        System.out.println("\nGenerated Meal Plan:");
        Meal.generateMeal(new VegetarianMeal());
        Meal.generateMeal(new VeganMeal());
        Meal.generateMeal(new Keto());
        Meal.generateMeal(new HighProtein());
    }
}
