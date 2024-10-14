package designpatterns.factory.fac2;

/**
 * @author karamanmert
 */
public class PushNotification implements Notification {
    @Override
    public NotificationType getType() {
        return NotificationType.PUSH;
    }

    @Override
    public void notifyUser() {
        System.out.println("Push notification");
    }
}
