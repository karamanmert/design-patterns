package designpatterns.singleton.sing3;

import static designpatterns.singleton.sing3.ColorEnum.*;

/**
 * @author karamanmert
 */
public class Logger {

    private static Logger logger;

    private Logger() {
    }

    public static Logger getInstance() {
        if (logger == null)
            logger = new Logger();

        return logger;
    }

    static class Colors {
        static final String RESET = "\u001B[0m";
        static final String RED = "\u001B[31m";
        static final String GREEN = "\u001B[32m";
        static final String YELLOW = "\u001B[33m";
        static final String BLUE = "\u001B[34m";
    }

    public void logInfo(String message) {
        apply2("info", message);
    }

    public void logError(String message) {
        apply(RED, message);
    }

    public void logWarn(String message) {
        apply(GREEN, message);
    }

    public void logDebug(String message) {
        apply(YELLOW, message);
    }


    private void apply(ColorEnum color, String message) {
        System.out.println(color.getColor() + message + RESET.getColor());
    }

    private void apply2(String type, String message) {
        switch (type) {
            case "info":
                System.out.println(BLUE.getColor() + message + RESET.getColor());
                break;
        }
    }
}
