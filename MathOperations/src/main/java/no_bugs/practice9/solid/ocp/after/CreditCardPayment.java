package no_bugs.practice9.solid.ocp.after;

public class CreditCardPayment implements IPaymentMethod {
    @Override
    public void pay() {
        System.out.println("Payment using credit card is proceed");
    }
}
