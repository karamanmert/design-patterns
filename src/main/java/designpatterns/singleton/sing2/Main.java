package designpatterns.singleton.sing2;

/**
 * @author karamanmert
 */
public class Main {

    public static void main(String[] args) {

        DatabaseConnection instance = DatabaseConnection.getInstance();
        instance.connect();

        DatabaseConnection instance2 = DatabaseConnection.getInstance();
        instance2.connect();

        boolean equal = instance == instance2; // referans kontrolü
        boolean equal2 = instance.equals(instance2); // içerik kontrolü

        System.out.println(equal);
        System.out.println(equal2);
    }
}
