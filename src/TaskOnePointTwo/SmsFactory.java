package TaskOnePointTwo;

public class SmsFactory implements NotificationFactory {
	
    @Override
    public Notification createNotification() {
        return new SmsNotification();
    }
}
