package homework_5.aquarium;

public abstract class Fish {
    private String species;

    public Fish(String species) {
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    public abstract void move();

    public abstract void showBehaviour();
}
