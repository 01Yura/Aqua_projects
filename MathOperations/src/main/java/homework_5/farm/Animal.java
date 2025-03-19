package homework_5.farm;

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
