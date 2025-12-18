package decorator;

public class Main {
    public static void main(String[] args) {
        // Notificador base
        Notifier notifier = new BasicNotifier();

        // Agregar decoradores en capas (composición: SMS + Email + WhatsApp)
        notifier = new SMSDecorator(notifier);
        notifier = new EmailDecorator(notifier);
        notifier = new WhatsAppDecorator(notifier);

        // Enviar notificación con todas las extensiones
        notifier.send("¡Hola, esto es una prueba!");
    }
}