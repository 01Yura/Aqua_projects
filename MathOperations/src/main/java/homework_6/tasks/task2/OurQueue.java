package homework_6.tasks.task2;

import java.util.ArrayDeque;

public class OurQueue {
    private ArrayDeque<String> queue;

    public OurQueue() {
        this.queue = new ArrayDeque<>();
    }

    public void addRequest(String request) {
        this.queue.offer(request);
    }

    public void performRequest() {
        this.queue.poll();
    }

    public void showOurQueue() {
        this.queue.forEach(System.out::println);
    }
}
