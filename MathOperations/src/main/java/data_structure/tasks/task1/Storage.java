package data_structure.tasks.task1;

import java.util.HashSet;

public class Storage {

    private HashSet<Integer> storage;

    public Storage() {
        this.storage = new HashSet<>();
    }

    public void addUserId(User user) {
        if (this.storage.add(user.getUserId())) {
            System.out.println("UserId " + user.getUserId() + " has been added to the storage");
        } else {
            System.out.println("This UserId is already in the storage");
        }
    }

    public void checkUserId(int userId) {
        if (this.storage.contains(userId)) {
            System.out.println("Id in the system");
        } else {
            System.out.println("Not found");
        }
    }

    public void showIdStorage() {
        System.out.println("Storage contains the following id's: ");
        this.storage.forEach(System.out::println);
    }
}
