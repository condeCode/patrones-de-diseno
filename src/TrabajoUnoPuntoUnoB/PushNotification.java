package TrabajoUnoPuntoUnoB;

public class PushNotification implements Notification {
	
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Enviando mensaje por notificación Push: " + mensaje);
    }
}
