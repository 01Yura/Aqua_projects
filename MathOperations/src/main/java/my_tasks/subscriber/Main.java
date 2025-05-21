package my_tasks.subscriber;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();

        manager.addSubscriber(new FreeSubscriber("x"));
        manager.addSubscriber(new FreeSubscriber("x"));
        manager.addSubscriber(new PremiumSubscriber("x"));
        manager.addSubscriber(new PremiumSubscriber("x"));

        manager.sendMessageToAllSubscribers();
    }
}
