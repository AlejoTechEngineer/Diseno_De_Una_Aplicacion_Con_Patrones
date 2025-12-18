package decorator;

public class WhatsAppDecorator extends NotifierDecorator {
    public WhatsAppDecorator(Notifier wrappedNotifier) {
        super(wrappedNotifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("Enviando por WhatsApp: " + message);
    }
}