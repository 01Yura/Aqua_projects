package homework_1.aquarium_package;

public class StarFish extends Fish {
    public StarFish(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(this.getName() + " is moving slowly");
    }

    @Override
    public void showBehaviour() {
        System.out.println(this.getName() + " is passive");
    }
}
