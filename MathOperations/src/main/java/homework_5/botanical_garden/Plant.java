package homework_5.botanical_garden;

public abstract class Plant {
    private final String SPECIES;
    private final int IDEAL_HUMIDITY_LEVEL;
    private final int IDEAL_LIGHT_LEVEL;
    private int currentHumidityLevel;
    private int currentLightLevel;

    public Plant(String SPECIES, int IDEAL_HUMIDITY_LEVEL, int IDEAL_LIGHT_LEVEL) {
        this.SPECIES = SPECIES;
        this.IDEAL_HUMIDITY_LEVEL = IDEAL_HUMIDITY_LEVEL;
        this.IDEAL_LIGHT_LEVEL = IDEAL_LIGHT_LEVEL;
        this.currentHumidityLevel = IDEAL_HUMIDITY_LEVEL;
        this.currentLightLevel = IDEAL_LIGHT_LEVEL;
    }

    public String getSPECIES() {
        return SPECIES;
    }

    public int getIDEAL_HUMIDITY_LEVEL() {
        return IDEAL_HUMIDITY_LEVEL;
    }

    public int getIDEAL_LIGHT_LEVEL() {
        return IDEAL_LIGHT_LEVEL;
    }

    public int getCurrentHumidityLevel() {
        return currentHumidityLevel;
    }

    public void setCurrentHumidityLevel(int currentHumidityLevel) {
        this.currentHumidityLevel = currentHumidityLevel;
    }

    public int getCurrentLightLevel() {
        return currentLightLevel;
    }

    public void setCurrentLightLevel(int currentLightLevel) {
        this.currentLightLevel = currentLightLevel;
    }
}
