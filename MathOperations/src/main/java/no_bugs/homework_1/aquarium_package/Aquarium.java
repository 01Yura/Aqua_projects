package no_bugs.homework_1.aquarium_package;

public class Aquarium {

    public void addFish(Fish fish) {
        System.out.println(fish.getName() + " has been added to the aquarium");
    }

    public void showFishMovement(Fish fish) {
        fish.move();
    }

    public void showFishBehaviour(Fish fish) {
        fish.showBehaviour();
    }
}
