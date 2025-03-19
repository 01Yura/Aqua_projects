package homework_6.tasks.task4;

import java.util.PriorityQueue;

public class Storage {
    PriorityQueue<Task> storage;

    public Storage() {
        this.storage = new PriorityQueue<>();
    }

    public void addTask(Task task) {
        this.storage.offer(task);
    }

    public void print() {
        this.storage.forEach(System.out::println);
    }

    public void performTask() {
        this.storage.poll();
    }
}
