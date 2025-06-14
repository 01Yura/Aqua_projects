package no_bugs.homework_5.aquarium;

public class Starfish extends Fish {
    public Starfish(String species) {
        super(species);
    }

    @Override
    public void move() {
        System.out.println(this.getSpecies() + " is moving slowly");
    }

    @Override
    public void showBehaviour() {
        System.out.println(this.getSpecies() + " is passive");
    }
}
