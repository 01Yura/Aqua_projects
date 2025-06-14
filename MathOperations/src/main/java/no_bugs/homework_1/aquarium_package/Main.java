package no_bugs.homework_1.aquarium_package;

public class Main {
    public static void main(String[] args) {
        Shark myShark = new Shark("Shark Baby");
        StarFish myStarFish = new StarFish("StarFish Zvezda");
        Aquarium myAquarium = new Aquarium();

        myAquarium.addFish(myShark);
        myAquarium.addFish(myStarFish);

        myAquarium.showFishMovement(myShark);
        myAquarium.showFishBehaviour(myStarFish);

    }
}
