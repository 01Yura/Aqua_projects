package no_bugs.homework_5.botanical_garden;

public class Garden {
    public void addPlant(Plant plant) {
        System.out.println(plant.getSPECIES() + " has been added into the garden");
    }

    public void showIdealConditions(Plant plant) {
        System.out.println("Ideal conditions for " + plant.getSPECIES() + ":");
        System.out.println("Humidity: " + plant.getIDEAL_HUMIDITY_LEVEL());
        System.out.println("Light: " + plant.getIDEAL_LIGHT_LEVEL());
    }

    public void showCurrentConditions(Plant plant) {
        System.out.println("Current conditions for " + plant.getSPECIES() + ":");
        System.out.println("Humidity: " + plant.getCurrentHumidityLevel());
        System.out.println("Light: " + plant.getCurrentLightLevel());
    }

    public void changeConditions(Plant plant, int humidityLevel, int lightLevel) {
        plant.setCurrentHumidityLevel(humidityLevel);
        plant.setCurrentLightLevel(lightLevel);
        showCurrentConditions(plant);
    }

}
