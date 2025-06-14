package no_bugs.homework_1.restaurant_package;

public class Restaurant {
    public void addDish(Dish dish) {
        System.out.println(dish.getName() + " has been added to menu");
    }

    public void serveTheDish(Dish dish) {
        System.out.println("The " + dish.getName() + " is served");
        dish.showKeyProperty();
    }
}
