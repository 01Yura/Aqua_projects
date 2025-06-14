package no_bugs.data_structure.tasks.task4;

import java.util.PriorityQueue;

public class Storage {
    private PriorityQueue storage;

    public Storage() {
        this.storage = new PriorityQueue<>();
    }

    public void addTask(Task task) {
        this.storage.offer(task);
        System.out.println("Task \"" + task.getTitle() + "\" has been added to the storage");
    }

    public void showStorage() {
        System.out.println("The list of tasks: ");
        this.storage.forEach(System.out::println);
    }

    public void performTask() {
        this.storage.poll();
    }
}
