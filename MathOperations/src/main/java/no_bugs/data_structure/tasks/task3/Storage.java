package no_bugs.data_structure.tasks.task3;

import java.util.HashMap;

public class Storage {
    HashMap<String, String> storage;

    public Storage() {
        this.storage = new HashMap<>();
    }

    public void addParametr(Parameter parameter) {
        this.storage.put(parameter.getParameterName(), parameter.getParameterValue());
    }

    public void showStorage() {
        System.out.println("The list of parameters: ");
        this.storage.entrySet().forEach(System.out::println);
    }

    public void removeParameterUsingName(String parameterName) {
        this.storage.remove(parameterName);
    }

    public void removeParameterUsingValue(String parameterValue) {
        this.storage.entrySet().removeIf(entry -> entry.getValue().equals(parameterValue));
    }
}
