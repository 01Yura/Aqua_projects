package no_bugs.homework_6.tasks.task3;

import java.util.HashMap;

public class Storage {
    private HashMap<String, String> storage;

    public Storage() {
        this.storage = new HashMap<>();
    }

    public void addParametr(Parameter parameter) {
        this.storage.put(parameter.getParameterName(), parameter.getParameterValue());
    }

    public void print() {
        this.storage.entrySet().forEach(System.out::println);
    }
}
