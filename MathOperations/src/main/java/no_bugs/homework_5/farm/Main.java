package no_bugs.homework_5.farm;

public class Main {
    public static void main(String[] args) {
        Farm myFarm = new Farm();
        Cow myCow = new Cow("Cow Burenka");
        Chicken myChicken = new Chicken("Chicken Broiler");

        myFarm.addAnimal(myCow);
        myFarm.addAnimal(myChicken);
        System.out.println();

        myFarm.feedAnimal(myCow);
        myFarm.cleanAnimal(myChicken);
        myFarm.grazeAnimal(myCow);
    }
}
