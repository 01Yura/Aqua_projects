package practice11.singleton.config;

public class ConfigurationManager {
    private static ConfigurationManager instance;
    private String databaseURL;
    private String username;
    private String password;
    private String pathToDirectory;
    private String logLevel;
    private String pathToLogFile;

    private ConfigurationManager() {
    }

    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    public void showConfig() {
        System.out.println("Database URL: " + databaseURL);
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("Path to directory: " + pathToDirectory);
        System.out.println("LogLevel: " + logLevel);
        System.out.println("Path to LogFile: " + pathToLogFile);
    }

    public void setDatabaseURL(String databaseURL) {
        this.databaseURL = databaseURL;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPathToDirectory(String pathToDirectory) {
        this.pathToDirectory = pathToDirectory;
    }

    public void setLogLevel(String logLevel) {
        this.logLevel = logLevel;
    }

    public void setPathToLogFile(String pathToLogFile) {
        this.pathToLogFile = pathToLogFile;
    }

}
