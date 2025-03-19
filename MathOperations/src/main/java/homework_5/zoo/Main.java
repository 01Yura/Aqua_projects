package homework_5.zoo;

public class Main {
    public static void main(String[] args) {
        Zoo myZoo = new Zoo();
        Elephant myElephant = new Elephant("Elephant Bobby");
        Bird myBird = new Bird("Bird Sinichka");

        myZoo.addAnimal(myBird);
        System.out.println();

        myZoo.showAnimalMovement(myBird);
        System.out.println();

        myZoo.showHowAnimalMakeSound(myElephant);
    }
}
