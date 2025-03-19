package data_structure.tasks.task6;

import java.util.HashMap;
import java.util.HashSet;

public class Storage {
    private HashMap<User, HashSet<User>> storage;

    public Storage() {
        this.storage = new HashMap<>();
    }

    public void showStorage() {
        System.out.println("The list of all friends: ");
        this.storage.entrySet().forEach(System.out::println);
    }

    public void addFriend(User user1, User user2) {
        this.storage.putIfAbsent(user1, new HashSet<>());
        this.storage.get(user1).add(user2);

        this.storage.putIfAbsent(user2, new HashSet<>());
        this.storage.get(user2).add(user1);
    }

    public void removeFriend(User user1, User user2) {
        this.storage.get(user1).remove(user2);
        this.storage.get(user2).remove(user1);
    }
}
