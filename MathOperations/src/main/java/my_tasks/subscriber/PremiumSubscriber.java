package my_tasks.subscriber;

public class PremiumSubscriber extends Subscriber {
    public PremiumSubscriber(String email) {
        super(email);
    }

    @Override
    public void sendMessage() {
        System.out.println("Premium message");
    }
}
