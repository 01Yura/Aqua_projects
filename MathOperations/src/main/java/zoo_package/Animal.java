package zoo_package;

public abstract class Animal {
    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void move();

    public abstract void makeSound();

    public String getName() {
        return name;
    }
}
