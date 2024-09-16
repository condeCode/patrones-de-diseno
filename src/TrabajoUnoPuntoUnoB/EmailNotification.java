package TrabajoUnoPuntoUnoB;

public class EmailNotification implements Notification {
	
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Enviando mensaje por correo: " + mensaje);
    }
}
