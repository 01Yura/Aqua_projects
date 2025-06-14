package no_bugs.homework_1.zoo_package;


public class Zoo {

    public void addAnimalToZoo(Animal animal) {

        System.out.println(animal.getName() + " has been added to the Zoo");
    }

    public void showMovement(Animal animal) {
        System.out.println("This is " + animal.getName());
        animal.move();
    }

    public void showSound(Animal animal) {
        System.out.println("This is " + animal.getName());
        animal.makeSound();
    }


}
