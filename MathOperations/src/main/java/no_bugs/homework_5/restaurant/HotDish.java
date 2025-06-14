package no_bugs.homework_5.restaurant;

public class HotDish extends Meal {
    public HotDish(String title, int keyProperty) {
        super(title, keyProperty);
    }

    @Override
    public void showKeyProperty() {
        System.out.println(this.getTitle() + " has temperature is about " + this.getKeyProperty() + " degrees of Celsius");
    }
}
