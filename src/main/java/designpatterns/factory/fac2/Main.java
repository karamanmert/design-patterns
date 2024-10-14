package designpatterns.factory.fac2;

/**
 * @author karamanmert
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Notification sms = NotificationFactory.createNotification2(NotificationType.SMS);
        sms.notifyUser();

        Notification email = NotificationFactory.createNotification(NotificationType.EMAIL);
        email.notifyUser();

        Notification push = NotificationFactory.createNotification(NotificationType.PUSH);
        push.notifyUser();
    }
}
