package no_bugs.homework_5.restaurant;

public class Main {
    public static void main(String[] args) {
        Restaurant myRestaurant = new Restaurant();
        HotDish myHotDish = new HotDish("Pasta Carbonara", 70);
        Beverage myBeverage = new Beverage("Tequila Sunrise", 250);

        myRestaurant.addMeal(myHotDish);
        myRestaurant.addMeal(myBeverage);
        System.out.println();

        myRestaurant.serveMeal(myHotDish);
        System.out.println();

        myRestaurant.serveMeal(myBeverage);
    }
}
