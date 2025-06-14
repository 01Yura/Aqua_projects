package no_bugs.singleton.after;

public class DatabaseConfig {
    private static DatabaseConfig databaseConfig;
    private String config;

    private DatabaseConfig() {

    }

    public static DatabaseConfig getInstance() {
        if (databaseConfig == null) {
            databaseConfig = new DatabaseConfig();
        }
        return databaseConfig;
    }

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config;
    }

    public void displayConfig() {
        System.out.println(config);
    }
}
