package TaskOnePointTwo;

public class EmailNotification implements Notification {
	
    @Override
    public void sendMessage(String message) {
        System.out.println("Enviando mensaje por correo: " + message);
    }
}
