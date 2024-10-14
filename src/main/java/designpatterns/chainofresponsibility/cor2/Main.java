package designpatterns.chainofresponsibility.cor2;

/**
 * @author karamanmert
 */
public class Main {

    public static void main(String[] args) {
        // factory ile tanımlanabilirdi.
        Handler firstLevel = new FirstLevelSupport();
        Handler secondLevel = new SecondLevelSupport();
        Handler thirdLevel = new ThirdLevelSupport();

        firstLevel.setNext(secondLevel);
        secondLevel.setNext(thirdLevel);

        firstLevel.handleRequest("Basit Sorun");
        secondLevel.handleRequest("Orta Seviye Sorun");
        thirdLevel.handleRequest("Zor Sorun");
    }
}
