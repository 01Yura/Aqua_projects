package homework_1.botanical_garden_package;

public class Main {
    public static void main(String[] args) {
        Garden myGarden = new Garden();
        Orchid myOrchid = new Orchid(80, 20, "Asian Orchid");
        Cactus myCactus = new Cactus(10, 90, "Mexican Cactus");

        myGarden.showIdealPlantConditions(myOrchid);
        System.out.println();
        myGarden.showCurrentPlantConditions(myOrchid);
        System.out.println();
        myGarden.changePlantConditions(myOrchid, -50, -20);
        System.out.println();
        myGarden.changePlantConditions(myOrchid, 30, 40);

    }
}
