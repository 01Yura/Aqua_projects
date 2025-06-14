package no_bugs.data_structure.tasks.task8;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Storage {
    Map<String, Set<User>> storage;

    public Storage() {
        this.storage = new HashMap<>();
    }

    public void navigateToWebPage(String webpage, User user) {
        this.storage.putIfAbsent(webpage, new HashSet<>());
        this.storage.get(webpage).add(user);
    }

    public void checkUniqueVisits(String website) {
        System.out.println("The number of unique visits of " + website + ": " + this.storage.get(website).size());
    }

    public void showStorage() {
        this.storage.entrySet().forEach(System.out::println);
    }
}
