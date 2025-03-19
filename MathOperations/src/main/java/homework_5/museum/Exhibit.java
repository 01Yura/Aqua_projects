package homework_5.museum;

public abstract class Exhibit {
    private final String IDEAL_STORAGE_COND;
    private String info;
    private String name;
    private String currentStorageCond;

    public Exhibit(String info, String name, String IDEAL_STORAGE_COND, String currentStorageCond) {
        this.info = info;
        this.name = name;
        this.IDEAL_STORAGE_COND = IDEAL_STORAGE_COND;
        this.currentStorageCond = currentStorageCond;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIDEAL_STORAGE_COND() {
        return IDEAL_STORAGE_COND;
    }

    public String getCurrentStorageCond() {
        return currentStorageCond;
    }

    public void setCurrentStorageCond(String currentStorageCond) {
        this.currentStorageCond = currentStorageCond;
    }

    public void maintain(String conditions) {
        this.setCurrentStorageCond(conditions);
    }
}
