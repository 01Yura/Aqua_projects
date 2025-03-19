package museum_package;

public abstract class Exhibit {
    private final String IDEAL_STORAGE_CONDITIONS;
    private String name;
    private String info;
    private String currentStoreConditions;

    public Exhibit(String name, String info, String IDEAL_STORAGE_CONDITIONS, String currentStoreConditions) {
        this.name = name;
        this.info = info;
        this.IDEAL_STORAGE_CONDITIONS = IDEAL_STORAGE_CONDITIONS;
        this.currentStoreConditions = currentStoreConditions;
    }

    public String getInfo() {
        return info;
    }

    public String getIdealStoreConditions() {
        return IDEAL_STORAGE_CONDITIONS;
    }

    public String getName() {
        return name;
    }

    public String getCurrentStoreConditions() {
        return currentStoreConditions;
    }

    public void setCurrentStoreConditions(String currentStoreConditions) {
        this.currentStoreConditions = currentStoreConditions;
    }
}


