package botanical_garden_package;

public abstract class Plant {
    private final int IDEAL_HUMIDITY;
    private final int IDEAL_LIGHT_LEVEL;
    private final String SPECIES;
    private int currentHumidity;
    private int currentLightLevel;

    public Plant(int IDEAL_HUMIDITY, int IDEAL_LIGHT_LEVEL, String SPECIES) {
        this.IDEAL_HUMIDITY = IDEAL_HUMIDITY;
        this.IDEAL_LIGHT_LEVEL = IDEAL_LIGHT_LEVEL;
        this.SPECIES = SPECIES;
        this.currentHumidity = IDEAL_HUMIDITY;
        this.currentLightLevel = IDEAL_LIGHT_LEVEL;
    }

    public String getSPECIES() {
        return SPECIES;
    }

    public int getIDEAL_HUMIDITY() {
        return IDEAL_HUMIDITY;
    }

    public int getIDEAL_LIGHT_LEVEL() {
        return IDEAL_LIGHT_LEVEL;
    }

    public int getCurrentHumidity() {
        return currentHumidity;
    }

    public void setCurrentHumidity(int currentHumidity) {
        this.currentHumidity = currentHumidity;
    }

    public int getCurrentLightLevel() {
        return currentLightLevel;
    }

    public void setCurrentLightLevel(int currentLightLevel) {
        this.currentLightLevel = currentLightLevel;
    }
}