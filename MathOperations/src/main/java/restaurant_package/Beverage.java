package restaurant_package;

public class Beverage extends Dish {
    public Beverage(String name, int keyProperty) {
        super(name, keyProperty);
    }

    @Override
    public void showKeyProperty() {
        System.out.println("The volume of " + this.getName() + " is " + this.getKeyProperty() + " ml");
    }
}
