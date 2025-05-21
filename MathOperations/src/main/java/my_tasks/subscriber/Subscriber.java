package my_tasks.subscriber;

public abstract class Subscriber {
    private final String email;

    public Subscriber(String email) {
        this.email = email;
    }

    public abstract void sendMessage();
}
