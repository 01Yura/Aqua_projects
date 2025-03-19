package aquarium_package;

public class Shark extends Fish {
    public Shark(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(this.getName() + " is moving fast");
    }

    @Override
    public void showBehaviour() {
        System.out.println(this.getName() + " is aggressive");

    }
}
