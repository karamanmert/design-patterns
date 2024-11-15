package designpatterns.chainofresponsibility.cor4;

/**
 * @author karamanmert
 * @date 15.10.2024
 */
public class RoleCheckHandler extends Handler {

    @Override
    public boolean handle(String username, String password) {
        if (!username.contains("admin")) {
            System.out.println("role yok");
            return false;
        }
        return handleNext(username, password);
    }
}
