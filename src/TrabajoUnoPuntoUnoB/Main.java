package TrabajoUnoPuntoUnoB;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        // correo
        NotificationFactory correoFactory = new EmailFactory();
        Notification notificacionCorreo = correoFactory.crearNotificacion();
        notificacionCorreo.enviarMensaje("Este es un mensaje enviado por correo.");

        // sms
        NotificationFactory smsFactory = new SmsFactory();
        Notification notificacionSMS = smsFactory.crearNotificacion();
        notificacionSMS.enviarMensaje("Este es un mensaje enviado por sms.");

        // push
        NotificationFactory pushFactory = new PushFactory();
        Notification notificacionPush = pushFactory.crearNotificacion();
        notificacionPush.enviarMensaje("Este es un mensaje enviado como notificación push.");
	}

}
