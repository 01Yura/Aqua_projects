package no_bugs.homework_5.pet;

public class PetHotel {

    private Pet pet;

    public void addPet(Pet pet) {
        this.pet = pet;
        System.out.println(pet.getName() + " has been added to the Pet Hotel");
    }

    public void feedPet() {
        System.out.println("We are feeding the " + pet.getName());
        this.pet.eat();
    }

    public void walkWithPet() {
        if (this.pet instanceof Walkable) {
            Walkable walkablePet = (Walkable) this.pet;
            walkablePet.walk();
        } else {
            System.out.println("Error! " + this.pet.getName() + " is not walking");
        }
    }

    public void playWithPet() {
        if (this.pet instanceof Playable) {
            Playable playablePet = (Playable) this.pet;
            playablePet.play();
        } else {
            System.out.println("Error! " + this.pet.getName() + " is not playing");
        }
    }
}
