package no_bugs.practice9.solid.ocp.after;

public class PaymentService {
    public void processPayment(IPaymentMethod paymentMethod) {
        paymentMethod.pay();
    }
}
