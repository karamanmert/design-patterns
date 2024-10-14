package designpatterns.factory.fac3;

/**
 * @author karamanmert
 */
public interface Database {
    DbType getType();
    void openConnection();
}
