
public class Logger {
    private static volatile Logger instance;
    private Logger() {}
    public static Logger getInstance() {
        if (instance == null) {
            synchronized (Logger.class) {
                if (instance == null) {
                    // Create a new instance if it doesn't exist
                    instance = new Logger();
                }
            }
        }
        return instance;
    }
    public void log(String message) {
        System.out.println("Logged: " + message);
    }
}