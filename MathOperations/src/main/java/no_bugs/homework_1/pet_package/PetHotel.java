package no_bugs.homework_1.pet_package;

public class PetHotel {
    public void addPet(Pet pet) {
        System.out.println(pet.getName() + " has been took in to the Pet hotel");
    }

    public void feed(Pet pet) {
        System.out.println("We are feeding the " + pet.getName());
        pet.eat();
    }

    public void walk(Pet pet) {
        System.out.println("We are walking with " + pet.getName());
        pet.walk();
    }

    public void play(Pet pet) {
        System.out.println("We are playing with " + pet.getName());
        pet.play();
    }
}
