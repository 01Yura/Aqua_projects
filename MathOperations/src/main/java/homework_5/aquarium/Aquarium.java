package homework_5.aquarium;

public class Aquarium {
    public void addFish(Fish fish) {
        System.out.println(fish.getSpecies() + " has been added to the aquarium");
    }

    public void showFish(Fish fish) {
        System.out.println("Welcome customers, now you will see the " + fish.getSpecies());
        fish.move();
        fish.showBehaviour();
    }

}
