package TaskOnePointTwo;

public class SmsNotification implements Notification {
	
    @Override
    public void sendMessage(String message) {
        System.out.println("Enviando mensaje por Sms: " + message);
    }
}
