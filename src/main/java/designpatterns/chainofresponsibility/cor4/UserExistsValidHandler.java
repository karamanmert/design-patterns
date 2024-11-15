package designpatterns.chainofresponsibility.cor4;

/**
 * @author karamanmert
 * @date 15.10.2024
 */
public class UserExistsValidHandler extends Handler {

    private final Database database;

    public UserExistsValidHandler(Database database) {
        this.database = database;
    }

    @Override
    public boolean handle(String username, String password) {
        if (!database.isValidUsername(username)) {
            System.out.println("user name hatalı");
            return false;
        }
        return handleNext(username, password);
    }
}
