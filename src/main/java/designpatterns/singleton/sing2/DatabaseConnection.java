package designpatterns.singleton.sing2;

/**
 * @author karamanmert
 */
public class DatabaseConnection {

    private static DatabaseConnection instance;

    private DatabaseConnection() {

    }

    public static DatabaseConnection getInstance() {
        if (instance == null) instance = new DatabaseConnection();
        return instance;
    }

    public void connect() {
        System.out.println("connected to db");
    }
}
