package TrabajoUnoPuntoUnoB;

public class PushFactory implements NotificationFactory{

    @Override
    public Notification crearNotificacion() {
        return new PushNotification();
    }
}
