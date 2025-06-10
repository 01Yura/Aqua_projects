package practice11.builder.onlineshop;

public class Main {
    public static void main(String[] args) {
        Order order = new Order("Toy", 10, "card");
        System.out.println(order);

        Order flexibleOrder = new Order.Builder()
                .setGoodName("Car")
                .setPaymentMethod("Cash").build();
        System.out.println(flexibleOrder);

    }
}
