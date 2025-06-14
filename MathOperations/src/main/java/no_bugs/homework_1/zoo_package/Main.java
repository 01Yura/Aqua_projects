package no_bugs.homework_1.zoo_package;

public class Main {
    public static void main(String[] args) {
        Zoo myZoo = new Zoo();
        Elephant myElephant = new Elephant("Elephant Bob");
        Bird myBird = new Bird("Bird Sinichka");
        myZoo.addAnimalToZoo(myElephant);
        myZoo.addAnimalToZoo(myBird);
        myZoo.showMovement(myElephant);
        myZoo.showSound(myBird);


    }
}
