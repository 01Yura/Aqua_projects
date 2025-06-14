package no_bugs.homework_5.aquarium;

public class Shark extends Fish {
    public Shark(String species) {
        super(species);
    }

    @Override
    public void move() {
        System.out.println(this.getSpecies() + " is moving fast");
    }

    @Override
    public void showBehaviour() {
        System.out.println(this.getSpecies() + " is aggressive");
    }
}
