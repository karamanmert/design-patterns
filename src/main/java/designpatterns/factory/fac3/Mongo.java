package designpatterns.factory.fac3;

/**
 * @author karamanmert
 */
public class Mongo implements Database {
    @Override
    public DbType getType() {
        return DbType.MONGO;
    }

    @Override
    public void openConnection() {

    }
}
