package homework_5.pet;

public class PetHotel {
    public void addPet(Pet pet) {
        System.out.println(pet.getName() + " has been added to the Pet Hotel");
    }

    public void feedPet(Pet pet) {
        System.out.println("We are feeding the " + pet.getName());
        pet.eat();
    }

    public void walkWithPet(Pet pet) {
        System.out.println("We are walking with the " + pet.getName());
        pet.walk();
    }

    public void playWithPet(Pet pet) {
        System.out.println("We are playing with the " + pet.getName());
        pet.play();
    }
}
