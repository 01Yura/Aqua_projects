package no_bugs.practice11.singleton.logger;

public class Logger {
    private static Logger instance;

    
    private Logger() {
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }


}
