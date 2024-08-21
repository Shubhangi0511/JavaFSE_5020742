public class LoggerTest {

    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        System.out.println("Are both loggers the same instance? " + (logger1 == logger2));
        logger1.log("Hello, World!");
        logger2.log("This is another log message.");
    }
}