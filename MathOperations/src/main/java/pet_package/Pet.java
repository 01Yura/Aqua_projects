package pet_package;

public abstract class Pet {
    private String name;

    public Pet(String name) {
        this.name = name;
    }

    public abstract void eat();

    public abstract void walk();

    public abstract void play();

    public String getName() {
        return name;
    }
}
