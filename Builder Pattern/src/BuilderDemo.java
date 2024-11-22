public class BuilderDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        System.out.println("Standard Meal:");
        Meal standardMeal = mealBuilder.prepareStandardMeal();
        standardMeal.showItems();
        System.out.println("Total Cost: " + standardMeal.getCost() + "\n");

        System.out.println("Deluxe Meal:");
        Meal deluxeMeal = mealBuilder.prepareDeluxeMeal();
        deluxeMeal.showItems();
        System.out.println("Total Cost: " + deluxeMeal.getCost());
    }
}


