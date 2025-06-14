package no_bugs.homework_1.botanical_garden_package;

public class Garden {
    public void addPlant(Plant plant) {
        System.out.println(plant.getSPECIES() + " has been added to the garden");
    }

    public void showIdealPlantConditions(Plant plant) {
        System.out.println("Ideal humidity for " + plant.getSPECIES() + " is " + plant.getIDEAL_HUMIDITY());
        System.out.println("Ideal light level for " + plant.getSPECIES() + " is " + plant.getIDEAL_LIGHT_LEVEL());
    }

    public void showCurrentPlantConditions(Plant plant) {
        System.out.println("Current humidity for " + plant.getSPECIES() + " is " + plant.getCurrentHumidity());
        System.out.println("Current light level for " + plant.getSPECIES() + " is " + plant.getCurrentLightLevel());
    }

    public void changePlantConditions(Plant plant, int humidity, int light) {
        plant.setCurrentHumidity(humidity);
        plant.setCurrentLightLevel(light);
        System.out.println("Conditions have been changed");
        this.showCurrentPlantConditions(plant);
    }

}
