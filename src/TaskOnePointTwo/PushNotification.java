package TaskOnePointTwo;

public class PushNotification implements Notification {
	
    @Override
    public void sendMessage(String message) {
        System.out.println("Enviando mensaje por notificación Push: " + message);
    }
}
