package homework_1.farm_package;

public class Main {
    public static void main(String[] args) {
        Farm myFarm = new Farm();
        Chicken myChicken = new Chicken("Chicken Broiler");
        Cow myCow = new Cow("Burenka");

        myFarm.addAnimal(myCow);
        myFarm.addAnimal(myChicken);

        myFarm.feedAnimal(myCow);
        myFarm.cleanAnimal(myCow);
        myFarm.grazeAnimal(myCow);
    }
}
