package TrabajoUnoPuntoUnoB;

public class EmailFactory implements NotificationFactory {
	
    @Override
    public Notification crearNotificacion() {
        return new EmailNotification();
    }
}
