package designpatterns.factory.fac3;

/**
 * @author karamanmert
 */
public class Test {

    public static void main(String[] args) {
        Database database = DatabaseConnectionFactory.createDatabase(DbType.MONGO);
        database.openConnection();

        Database database2 = DatabaseConnectionFactory.createDatabase2(DbType.POSTGRESQL);
        database2.openConnection();
    }
}
