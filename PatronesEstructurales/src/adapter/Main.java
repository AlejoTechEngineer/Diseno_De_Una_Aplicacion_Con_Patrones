package adapter;

public class Main {
    public static void main(String[] args) {
        // Sistema legacy
        OldPayment oldPayment = new OldPayment();

        // Adapter para integrarlo con la interfaz moderna
        Payment adapter = new PaymentAdapter(oldPayment);

        // Uso como si fuera la interfaz moderna
        adapter.process("100.50");
    }
}