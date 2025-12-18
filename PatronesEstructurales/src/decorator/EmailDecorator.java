package decorator;

public class EmailDecorator extends NotifierDecorator {
    public EmailDecorator(Notifier wrappedNotifier) {
        super(wrappedNotifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("Enviando por Email: " + message);
    }
}