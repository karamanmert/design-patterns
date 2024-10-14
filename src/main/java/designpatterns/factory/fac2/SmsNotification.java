package designpatterns.factory.fac2;

/**
 * @author karamanmert
 */
public class SmsNotification implements Notification{
    @Override
    public NotificationType getType() {
        return NotificationType.SMS;
    }

    @Override
    public void notifyUser() {
        System.out.println("SMS notification");
    }
}
