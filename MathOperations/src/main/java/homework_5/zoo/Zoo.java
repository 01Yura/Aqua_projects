package homework_5.zoo;

public class Zoo {

    public void addAnimal(Animal animal) {
        System.out.println(animal.getName() + " has been added to the Zoo");
    }

    public void showAnimalMovement(Animal animal) {
        animal.move();
    }

    public void showHowAnimalMakeSound(Animal animal) {
        animal.makeSound();
    }
}
