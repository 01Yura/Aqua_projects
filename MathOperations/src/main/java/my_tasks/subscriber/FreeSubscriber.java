package my_tasks.subscriber;

public class FreeSubscriber extends Subscriber {

    public FreeSubscriber(String email) {
        super(email);
    }

    @Override
    public void sendMessage() {
        System.out.println("Simple message");
    }
}
