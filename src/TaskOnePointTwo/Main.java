package TaskOnePointTwo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        // email notification
        NotificationFactory correoFactory = new EmailFactory();
        Notification notificacionCorreo = correoFactory.createNotification();
        notificacionCorreo.sendMessage("Este es un mensaje enviado por correo");

        // sms notification
        NotificationFactory smsFactory = new SmsFactory();
        Notification notificacionSMS = smsFactory.createNotification();
        notificacionSMS.sendMessage("Este es un mensaje enviado por sms");

        // push notification
        NotificationFactory pushFactory = new PushFactory();
        Notification notificacionPush = pushFactory.createNotification();
        notificacionPush.sendMessage("Este es un mensaje enviado como notificación push");

	}
}
