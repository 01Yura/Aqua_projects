package my_tasks.farm;

public class Main {
    public static void main(String[] args) throws NonexistingAnimalException {
        Farm<Animal> farm = new Farm<>();

        Cow cow1 = new Cow("Marusia", "grass", 6);
        Cow cow2 = new Cow("Burenka", "grass", 7);

        Pig pig1 = new Pig("Funtic", "leftovers", 3);
        Pig pig2 = new Pig("Svin", "leftovers", 4);

        farm.addAnimal(cow1);
        farm.addAnimal(cow2);
        farm.addAnimal(pig1);
        farm.addAnimal(pig2);

        farm.feedAnimal("Pig");
        System.out.println();

        farm.makeSomeSound("Cow");
        System.out.println("-----------------feedAnimal-----------------");


        farm.feedAnimal(Food.GRASS);

        System.out.println();

        try {
            farm.feedAnimal(Food.BURGERS);
        } catch (NonexistingAnimalException e) {
            e.printStackTrace();
        }

        System.out.println();

        farm.sortByAge();
        System.out.println();
        farm.filterByAge(5);

    }
}
