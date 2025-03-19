package homework_5.farm;

public class Farm {

    public void addAnimal(Animal animal) {
        System.out.println(animal.getName() + " has been added to the farm");
    }

    public void feedAnimal(Animal animal) {
        System.out.println("We are feeding the " + animal.getName());
    }

    public void cleanAnimal(Animal animal) {
        System.out.println("We are cleaning the " + animal.getName());
    }

    public void grazeAnimal(Animal animal) {
        System.out.println("We are grazing the " + animal.getName());
    }
}
