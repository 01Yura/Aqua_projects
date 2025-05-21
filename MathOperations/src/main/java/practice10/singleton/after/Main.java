package practice10.singleton.after;

public class Main {
    public static void main(String[] args) {
        DatabaseConfig config1 = DatabaseConfig.getInstance();
        config1.setConfig("Config_1");

        DatabaseConfig config2 = DatabaseConfig.getInstance();
        config2.setConfig("Config_2");

        config1.displayConfig();
        config2.displayConfig();
    }
}
