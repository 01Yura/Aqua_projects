package no_bugs.data_structure.tasks.task16_2_hashMap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Storage {
    private HashMap<String, Double> storage;

    public Storage() {
        this.storage = new HashMap<>();
    }

    public void addTask(Task task) {
        this.storage.put(task.getTaskName(), task.getDeadline());
    }

    public void removeTask(Task task) {
        this.storage.remove(task.getTaskName());
    }

    public void printSortedTasks() {
        ArrayList<Map.Entry<String, Double>> sortedList = new ArrayList(this.storage.entrySet());
        sortedList.sort(Comparator.comparing(entry -> entry.getValue()));
        System.out.println(sortedList);


    }

    public void print() {
        System.out.println(this.storage);
    }
}
