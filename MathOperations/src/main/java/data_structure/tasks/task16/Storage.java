package data_structure.tasks.task16;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Storage {
    List<Task> storage;

    public Storage() {
        this.storage = new LinkedList<>();
    }

    public void addTask(Task task) {
        this.storage.add(task);
    }

    public void removeTask(Task task) {
        this.storage.remove(task);
    }

    public void printSortedTasks() {
        Collections.sort(this.storage);
        System.out.println("The list of tasks: ");
        storage.forEach(System.out::println);
    }

    public void print() {
        System.out.println(this.storage);
    }
}
