package adapter;

public class PaymentAdapter implements Payment {
    private OldPayment oldPayment;

    public PaymentAdapter(OldPayment oldPayment) {
        this.oldPayment = oldPayment;
    }

    @Override
    public void process(String amount) {
        // Convertir String a double (adaptación simple)
        double value = Double.parseDouble(amount);
        oldPayment.makePayment(value);
    }
}