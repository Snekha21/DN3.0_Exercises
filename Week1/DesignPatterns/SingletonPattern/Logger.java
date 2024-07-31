package SingletonPattern;

public class Logger {
    // Private static instance of Logger
    private static Logger instance;

    // Private constructor to prevent instantiation
    private Logger() {
        // Optional: Initialize resources
    }

    // Public static method to get the single instance of Logger
    public static Logger getInstance() {
        if (instance == null) {
            synchronized (Logger.class) {
                if (instance == null) {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

    // Method to log messages
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}

