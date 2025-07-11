package no_bugs.homework_5.zoo;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void move();

    public abstract void makeSound();
}
