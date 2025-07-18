package no_bugs.homework_1.farm_package;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void eat();

    public abstract void clean();

    public abstract void graze();
}
