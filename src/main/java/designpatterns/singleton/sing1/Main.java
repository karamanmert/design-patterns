package designpatterns.singleton.sing1;

/**
 * @author karamanmert
 */
public class Main {
    public static void main(String[] args) {
        // Singleton ins1 =  new Singleton();

        Singleton instance = Singleton.getInstance();

        instance.doSomething();
    }
}
