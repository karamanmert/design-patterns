package designpatterns.factory.fac2;

import java.util.Map;

/**
 * @author karamanmert
 */
public class NotificationFactory {

    // first way
    public static Notification createNotification(NotificationType type) {
        if (type.name().isBlank())
            throw new IllegalArgumentException("Notification type can not be null");

        return switch (type) {
            case SMS -> new SmsNotification();
            case EMAIL -> new EmailNotification();
            case PUSH -> new PushNotification();
        };
    }


    // second way
    private static final Map<NotificationType,Notification> notificationMap =
            Map.of(
                    NotificationType.SMS, new SmsNotification(),
                    NotificationType.EMAIL, new SmsNotification(),
                    NotificationType.PUSH, new SmsNotification()
            );


    public static Notification createNotification2(NotificationType type) throws Exception {
        if (type.name().isBlank())
            throw new IllegalArgumentException("Notification type can not be null");

        Notification notification = notificationMap.get(type);
        if (notification == null) {
            throw new Exception("Not a notification");
        }

        return notification;
    }
}
