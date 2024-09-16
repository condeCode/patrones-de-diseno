package TrabajoUnoPuntoUnoB;

public class SmsNotification implements Notification {
	
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Enviando mensaje por Sms: " + mensaje);
    }
}
