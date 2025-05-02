package homework_1.restaurant_package;

public class HotDish extends Dish {
    public HotDish(String name, int keyProperty) {
        super(name, keyProperty);
    }

    @Override
    public void showKeyProperty() {
        System.out.println("The temperature of " + this.getName() + " is " + this.getKeyProperty() + " degrees of Celsius");
    }
}
