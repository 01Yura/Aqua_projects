package no_bugs.homework_5.restaurant;

public class Restaurant {
    public void addMeal(Meal meal) {
        System.out.println(meal.getTitle() + " has been added to the menu");
    }

    public void serveMeal(Meal meal) {
        System.out.println(meal.getTitle() + " is serving now");
        meal.showKeyProperty();
    }
}
