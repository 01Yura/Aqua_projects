package no_bugs.homework_1.restaurant_package;

public abstract class Dish {
    private int keyProperty;
    private String name;

    public Dish(String name, int ketProperty) {
        this.name = name;
        this.keyProperty = keyProperty;
    }

    public abstract void showKeyProperty();

    public int getKeyProperty() {
        return keyProperty;
    }

    public String getName() {
        return name;
    }
}
