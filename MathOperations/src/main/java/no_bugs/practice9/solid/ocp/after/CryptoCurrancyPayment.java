package no_bugs.practice9.solid.ocp.after;

public class CryptoCurrancyPayment implements IPaymentMethod {
    @Override
    public void pay() {
        System.out.println("Payment using Bitcoin is proceed");
    }
}
