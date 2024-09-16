package TrabajoUnoPuntoUnoB;

public class SmsFactory implements NotificationFactory {
	
    @Override
    public Notification crearNotificacion() {
        return new SmsNotification();
    }
}
