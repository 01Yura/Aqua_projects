package no_bugs.data_structure.tasks.task7;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Storage {
    private List<Integer> storage;

    public Storage() {
        this.storage = new LinkedList<>();
    }

    public void addNumber(int number) {
        this.storage.add(number);
        Collections.sort(this.storage);
    }

    public void showMinValue() {
        System.out.println(this.storage.getFirst());
    }

    public void showMaxValue() {
        System.out.println(this.storage.getLast());
    }

    public void showStorage() {
        System.out.println("The list of all elements: ");
        this.storage.forEach(System.out::println);
    }
}
