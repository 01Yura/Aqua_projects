package no_bugs.practice9.solid.ocp.after;

public class Main {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        paymentService.processPayment(new CreditCardPayment());
        paymentService.processPayment(new CryptoCurrancyPayment());
        paymentService.processPayment(new PayPalPayment());
    }
}
