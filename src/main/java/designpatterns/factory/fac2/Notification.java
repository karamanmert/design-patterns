package designpatterns.factory.fac2;

/**
 * @author karamanmert
 */
public interface Notification {

    NotificationType getType();

    void notifyUser();
}
