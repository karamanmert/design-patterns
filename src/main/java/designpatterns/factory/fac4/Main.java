package designpatterns.factory.fac4;

/**
 * @author karamanmert
 * @date 14.10.2024
 */
public class Main {

    public static void main(String[] args) {
        Animal cat = AnimalFactory.getAnimal("cat");
        cat.voice();
        cat.sleep();
    }
}
