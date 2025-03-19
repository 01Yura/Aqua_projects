package aquarium_package;

public abstract class Fish {
    private String name;

    public Fish(String name) {
        this.name = name;
    }

    public abstract void move();

    public abstract void showBehaviour();

    public String getName() {
        return name;
    }
}
