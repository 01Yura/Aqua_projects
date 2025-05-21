package my_tasks.subscriber;

import java.util.ArrayList;
import java.util.List;

public class Manager {
    List<Subscriber> subscribers;

    public Manager() {
        this.subscribers = new ArrayList<>();
    }

    public boolean addSubscriber(Subscriber subscriber) {
        return subscribers.add(subscriber);
    }

    public void sendMessageToAllSubscribers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.sendMessage();
        }
    }
}
