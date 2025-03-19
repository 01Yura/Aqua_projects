package farm_package;

public class Farm {
    public void addAnimal(Animal animal) {
        System.out.println(animal.getName() + " has been added to the farm");
    }

    public void feedAnimal(Animal animal) {
        animal.eat();
    }

    public void cleanAnimal(Animal animal) {
        animal.clean();
    }

    public void grazeAnimal(Animal animal) {
        animal.graze();
    }

}
