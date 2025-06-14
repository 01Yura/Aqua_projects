package no_bugs.practice11.singleton.config;

public class Main {
    public static void main(String[] args) {
        ConfigurationManager config = ConfigurationManager.getInstance();
        config.setDatabaseURL("https://cloud.com//db");
        config.setUsername("admin");
        config.setPassword("qwerty123");

        config.showConfig();

        ConfigurationManager config2 = ConfigurationManager.getInstance();
        config2.setPassword("123");
        System.out.println();
        config.showConfig();
        System.out.println();
        config2.showConfig();

    }
}
