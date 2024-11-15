package designpatterns.chainofresponsibility.cor4;

/**
 * @author karamanmert
 * @date 15.10.2024
 */
public class Main {

    public static void main(String[] args) {
        Database database = new Database();

        Handler handler = new UserExistsValidHandler(database);
        handler.setNextHandler(new ValidPasswordHandler(database));
        handler.setNextHandler(new RoleCheckHandler());

        AuthService authService = new AuthService(handler);


        authService.logIn("user1","pass");
        System.out.println("-----");
        authService.logIn("user","user_pass");
        System.out.println("-----");
        authService.logIn("admin","admin_pass");
    }
}
