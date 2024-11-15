package designpatterns.chainofresponsibility.cor4;

import java.util.HashMap;

/**
 * @author karamanmert
 * @date 15.10.2024
 */
public class Database {

    HashMap<String,String> users = new HashMap<>();

    public Database() {
        users.put("admin", "admin_pass");
        users.put("user", "user_pass");
    }

    public boolean isValidUsername(String username) {
        return users.containsKey(username);
    }

    public boolean isValidPassword(String username, String password) {
        return users.get(username).equals(password);
    }
}
