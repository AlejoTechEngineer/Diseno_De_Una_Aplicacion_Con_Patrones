package decorator;

public class SMSDecorator extends NotifierDecorator {
    public SMSDecorator(Notifier wrappedNotifier) {
        super(wrappedNotifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("Enviando por SMS: " + message);
    }
}