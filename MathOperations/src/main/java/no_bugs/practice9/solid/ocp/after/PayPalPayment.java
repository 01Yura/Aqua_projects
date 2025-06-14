package no_bugs.practice9.solid.ocp.after;

public class PayPalPayment implements IPaymentMethod {
    @Override
    public void pay() {
        System.out.println("Payment using PayPal is proceed");
    }
}
