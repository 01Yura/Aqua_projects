package no_bugs.homework12.task1;

import java.util.ArrayList;
import java.util.List;

public class EntityManager<T extends EntityAbilities> {
    private ArrayList<T> list;

    EntityManager() {
        list = new ArrayList<>();
    }

    public ArrayList<T> getList() {
        return list;
    }

    public synchronized void addElement(T element) {
        this.list.add(element);
    }

    public boolean removeElement(T element) {
        if (this.list.contains(element)) {
            this.list.remove(element);
            return true;
        } else return false;
    }

    public synchronized List<T> returnCopyList() {
        ArrayList<T> copyList = new ArrayList<>(this.list);
        return copyList;
    }

    public synchronized List<T> filterByAge(int minAge, int maxAge) {
        return list.stream().filter(element -> element.getAge() >= minAge && element.getAge() <= maxAge).toList();
    }

    public synchronized List<T> filterByName(String name) {
        return this.list.stream().filter(element -> element.getName().equalsIgnoreCase(name)).toList();
    }

    public synchronized List<T> filterByStatus(boolean status) {
        return this.list.stream().filter(element -> element.getEmployed() == status).toList();
    }

}


