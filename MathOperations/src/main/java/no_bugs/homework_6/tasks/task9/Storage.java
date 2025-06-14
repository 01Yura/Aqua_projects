package no_bugs.homework_6.tasks.task9;

import java.util.ArrayDeque;

public class Storage {
    private ArrayDeque<String> doneStorage;
    private ArrayDeque<String> canceledStorage;

    public Storage() {
        this.doneStorage = new ArrayDeque<>();
        this.canceledStorage = new ArrayDeque<>();
    }

    public void performAction(String action) {
        this.doneStorage.offerLast(action);
    }

    public void ctrlZ() {
        this.canceledStorage.offerLast(this.doneStorage.removeLast());
    }

    public void ctrlY() {
        this.doneStorage.offerLast(this.canceledStorage.removeLast());
    }

    public void print() {
        this.doneStorage.forEach(System.out::println);
    }


}


