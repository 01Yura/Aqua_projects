package homework_1.restaurant_package;

public class Main {
    public static void main(String[] args) {
        Restaurant myRestaurant = new Restaurant();
        HotDish myHotDish = new HotDish("Carbonara", 70);
        Beverage myBeverage = new Beverage("Tequila Sunrise", 250);
        myRestaurant.addDish(myBeverage);
        myRestaurant.addDish(myHotDish);
        myRestaurant.serveTheDish(myBeverage);
        myRestaurant.serveTheDish(myHotDish);
    }
}
