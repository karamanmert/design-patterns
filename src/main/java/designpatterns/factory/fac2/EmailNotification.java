package designpatterns.factory.fac2;

/**
 * @author karamanmert
 */
public class EmailNotification implements Notification {

    @Override
    public NotificationType getType() {
        return NotificationType.EMAIL;
    }

    @Override
    public void notifyUser() {
        System.out.println("Email notification");
    }
}
