package no_bugs.homework_6.tasks.task6;

import java.util.HashMap;
import java.util.HashSet;

public class SocialNetwork {
    private HashMap<Friend, HashSet<Friend>> storage;

    public SocialNetwork() {
        this.storage = new HashMap<>();
    }

    public void addFriend(Friend friend1, Friend friend2) {
        this.storage.putIfAbsent(friend1, new HashSet<>());
        this.storage.get(friend1).add(friend2);

        this.storage.putIfAbsent(friend2, new HashSet<>());
        this.storage.get(friend2).add(friend1);
    }

    public void print() {
        this.storage.entrySet().forEach(System.out::println);
    }
}
