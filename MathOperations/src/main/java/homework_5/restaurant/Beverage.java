package homework_5.restaurant;

public class Beverage extends Meal {
    public Beverage(String title, int keyProperty) {
        super(title, keyProperty);
    }

    @Override
    public void showKeyProperty() {
        System.out.println(this.getTitle() + " has volume is about " + this.getKeyProperty() + " ml");
    }
}
