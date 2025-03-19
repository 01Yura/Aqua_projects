package data_structure.tasks.task9;

import java.util.ArrayDeque;
import java.util.Deque;

public class Storage {
    Deque<String> doneStorage;
    Deque<String> redoStorage;

    public Storage() {
        this.doneStorage = new ArrayDeque<>();
        this.redoStorage = new ArrayDeque<>();
    }

    public void doAction(String action) {
        doneStorage.add(action);
    }

    public void ctrlZ() {
        this.redoStorage.add(doneStorage.pollLast());
    }

    public void ctrlY() {
        this.doneStorage.add(this.redoStorage.pollLast());
    }

    public void showStorage() {
        System.out.println("These actions display on the screen: ");
        this.doneStorage.forEach(System.out::println);
    }
}
