package designpatterns.chainofresponsibility.cor4;

/**
 * @author karamanmert
 * @date 15.10.2024
 */
public class ValidPasswordHandler extends Handler {

    private final Database database;


    public ValidPasswordHandler(Database database) {
        this.database = database;
    }

    @Override
    public boolean handle(String username, String password) {
        if (!database.isValidPassword(username, password)) {
            System.out.println("şifre yanlış");
            return false;
        }
        return handleNext(username, password);
    }
}
