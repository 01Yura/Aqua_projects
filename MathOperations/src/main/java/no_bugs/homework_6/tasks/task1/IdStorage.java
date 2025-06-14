package no_bugs.homework_6.tasks.task1;

import java.util.HashSet;

public class IdStorage {
    private HashSet<Integer> idHashSet;

    public IdStorage() {
        this.idHashSet = new HashSet<>();
    }

    public void addId(Id id) {
        this.idHashSet.add(id.getId());
    }

    public void showIdStorage() {
        this.idHashSet.forEach(System.out::println);
    }

    public boolean checkId(Integer id) {
        return this.idHashSet.contains(id);
    }

}
