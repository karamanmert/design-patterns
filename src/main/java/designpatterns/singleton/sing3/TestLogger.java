package designpatterns.singleton.sing3;

/**
 * @author karamanmert
 */
public class TestLogger {

    public static void main(String[] args) {
        Logger instance = Logger.getInstance();

        instance.logInfo("info");
        instance.logDebug("debug");
        instance.logError("error");
        instance.logWarn("warn");

        System.out.println(Logger.Colors.BLUE);
    }
}