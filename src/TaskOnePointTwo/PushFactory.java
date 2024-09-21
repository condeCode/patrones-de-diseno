package TaskOnePointTwo;

public class PushFactory implements NotificationFactory{

    @Override
    public Notification createNotification() {
        return new PushNotification();
    }
}
