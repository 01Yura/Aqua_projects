package data_structure.tasks.task9;

import java.util.ArrayDeque;
import java.util.Deque;

public class Storage {
    Deque<String> doneStorage;
    Deque<String> undoneStorage;

    public Storage() {
        this.doneStorage = new ArrayDeque<>();
        this.undoneStorage = new ArrayDeque<>();
    }

    public void doAction(String action) {
        doneStorage.add(action);
    }

    public void ctrlZ() {
        this.undoneStorage.add(this.doneStorage.pollLast());
    }

    public void ctrlY() {
        this.doneStorage.add(this.undoneStorage.pollLast());
    }

    public void showStorage() {
        System.out.println("These actions display on the screen: ");
        this.doneStorage.forEach(System.out::println);
    }
}
