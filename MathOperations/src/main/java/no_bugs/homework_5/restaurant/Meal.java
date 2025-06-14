package no_bugs.homework_5.restaurant;

public abstract class Meal {
    private String title;
    private int keyProperty;

    public Meal(String title, int keyProperty) {
        this.title = title;
        this.keyProperty = keyProperty;
    }

    public String getTitle() {
        return title;
    }

    public int getKeyProperty() {
        return keyProperty;
    }

    public abstract void showKeyProperty();
}
