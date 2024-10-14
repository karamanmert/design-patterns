package designpatterns.factory.fac3;

/**
 * @author karamanmert
 */
public class Postgresql implements Database {
    @Override
    public DbType getType() {
        return DbType.POSTGRESQL;
    }

    @Override
    public void openConnection() {
        System.out.println("connect to Postgresql");
    }
}
