package no_bugs.homework_6.tasks.task8;

import java.util.HashMap;
import java.util.HashSet;

public class WebStorage {
    private HashMap<String, HashSet<Integer>> webStorage;

    public WebStorage() {
        this.webStorage = new HashMap<>();
    }

    public void navigateToWebsite(String websiteName, int ip) {
        this.webStorage.putIfAbsent(websiteName, new HashSet<>());
        this.webStorage.get(websiteName).add(ip);
    }

    public void print() {
        this.webStorage.entrySet().forEach(System.out::println);
    }

    public void checkUniqueVisits(String websiteName) {
        System.out.println("The number of unique visits of website: " + websiteName + " :" + this.webStorage.get(websiteName).size());
    }
}
