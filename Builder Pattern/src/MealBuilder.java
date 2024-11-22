public class MealBuilder {
    public Meal prepareStandardMeal() {
        Meal meal = new Meal();
        meal.addItem(new Burger());
        meal.addItem(new Fries());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareDeluxeMeal() {
        Meal meal = new Meal();
        meal.addItem(new Burger());
        meal.addItem(new Fries());
        meal.addItem(new Pepsi());
        return meal;
    }
}
