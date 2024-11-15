package designpatterns.chainofresponsibility.cor4;

/**
 * @author karamanmert
 * @date 15.10.2024
 */
public class AuthService {

   private final Handler handler;

    public AuthService(Handler handler) {
        this.handler = handler;
    }

    public boolean logIn(String username, String password) {
        if (!handler.handle(username, password)){
            System.out.println("not login...");
            return false;
        }
        return true;
    }
}
