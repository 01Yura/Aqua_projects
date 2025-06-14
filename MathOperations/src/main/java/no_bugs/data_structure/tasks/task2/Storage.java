package no_bugs.data_structure.tasks.task2;

import java.util.ArrayDeque;

public class Storage {

    private ArrayDeque<String> storage;

    public Storage() {
        this.storage = new ArrayDeque<>();
    }

    public void addRequest(String request) {
        this.storage.offer(request);
        System.out.println("Request has been added to the storage");
    }

    public void performRequest() {
        System.out.println("Request \"" + this.storage.peek() + "\" has been performed");
        this.storage.poll();
    }

    public void showRequests() {
        System.out.println("The list of requests: ");
        this.storage.forEach(System.out::println);
    }
}
