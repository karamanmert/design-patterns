package designpatterns.factory.fac3;

import java.util.EnumMap;
import java.util.Map;

import static designpatterns.factory.fac3.DbType.*;

/**
 * @author karamanmert
 */
public class DatabaseConnectionFactory {

    private DatabaseConnectionFactory() {
    }

    // first way use switch
    public static Database createDatabase(DbType dbType) {
        if (dbType == null) {
            return null;
        }
        return switch (dbType) {
            case MYSQL -> new MySql();
            case MONGO -> new Mongo();
            case POSTGRESQL -> new Postgresql();
            default -> throw new IllegalStateException("Unexpected value: " + dbType);
        };
    }

    // second way use map
    private static final Map<DbType, Database> databases = new EnumMap<>(DbType.class);

    static {
        databases.put(MYSQL, new MySql());
        databases.put(MONGO, new Mongo());
        databases.put(POSTGRESQL, new Postgresql());
    }

    public static Database createDatabase2(DbType dbType) {
        if (databases.get(dbType) == null) {
            throw new IllegalArgumentException("Unknown database type: " + dbType);
        }
        return databases.get(dbType);
    }
}
