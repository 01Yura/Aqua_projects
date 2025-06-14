package no_bugs.homework_5.aquarium;

public class Main {
    public static void main(String[] args) {
        Aquarium myAquarium = new Aquarium();
        Shark myShark = new Shark("Big white Shark");
        Starfish myStarfish = new Starfish("Starfish from Pacific ocean");

        myAquarium.addFish(myShark);
        myAquarium.addFish(myStarfish);
        System.out.println();

        myAquarium.showFish(myShark);
        System.out.println();
        
        myAquarium.showFish(myStarfish);
    }
}
