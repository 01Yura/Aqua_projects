package data_structure.tasks.task10;

import java.util.HashMap;
import java.util.Map;

public class Storage {
    private Map<String, String> storage;

    public Storage() {
        this.storage = new HashMap<>();
    }

    public void addRecord(Person person) {
        this.storage.put(person.getPersonName(), person.getPersonPhoneNumber());
    }

    public void findNumber(String name) {
        System.out.println(this.storage.get(name));
    }

    public void showStorage() {
        System.out.println("The phoneBook: ");
        this.storage.entrySet().forEach(System.out::println);
    }

}
