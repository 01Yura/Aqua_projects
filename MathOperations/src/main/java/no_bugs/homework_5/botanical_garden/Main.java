package no_bugs.homework_5.botanical_garden;

public class Main {
    public static void main(String[] args) {
        Garden myGarden = new Garden();
        Cactus myCactus = new Cactus("Mexican Cactus", 10, 90);
        Orchid myOrchid = new Orchid("Asian Orchid", 80, 20);

        myGarden.addPlant(myCactus);
        myGarden.addPlant(myOrchid);
        System.out.println();

        myGarden.showIdealConditions(myCactus);
        System.out.println();
        myGarden.changeConditions(myCactus, 30, 100);

    }
}
