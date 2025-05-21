package my_tasks.farm;

public enum Food {
    GRASS(100),
    LEFTOVERS(500),
    BURGERS(400);

    int calories;

    Food(int calories) {
        this.calories = calories;
    }

    public void showFoodInfo() {
        System.out.println(calories);
    }
}
