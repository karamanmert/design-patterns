package designpatterns.factory.fac3;

/**
 * @author karamanmert
 */
public class MySql implements Database {
    @Override
    public DbType getType() {
        return DbType.MYSQL;
    }

    @Override
    public void openConnection() {
        System.out.println("connect to mysql");
    }
}
