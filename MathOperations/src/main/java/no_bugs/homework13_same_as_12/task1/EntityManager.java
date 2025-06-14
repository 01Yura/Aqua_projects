package no_bugs.homework13_same_as_12.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EntityManager<T extends EntityMethods> {
    private List<T> list;

    public EntityManager() {
        this.list = new ArrayList<>();
    }

    public synchronized boolean addEntity(T entity) {
        if (list.contains(entity)) {
            return false;
        } else {
            return list.add(entity);
        }
    }

    public synchronized boolean deleteEntity(T entity) {
        if (list.contains(entity)) {
            return list.remove(entity);
        } else {
            return false;
        }
    }

    public synchronized List<T> returnCopyOfList() {
        return new ArrayList<>(list);
    }

    public List<T> filterByAge(int min, int max) {
        List<T> filteredList = new ArrayList<>();
        return filteredList = list.stream().filter(entity -> entity.getAge() >= min && entity.getAge() <= max).collect(Collectors.toList());
    }

    public List<T> getList() {
        return list;
    }

    public List<T> filterByStatus(boolean status) {
        List<T> filteredList = new ArrayList<>();
        return filteredList = list.stream().filter(entity -> entity.getisActive() == status).collect(Collectors.toList());
    }

    public List<T> filterByName(String name) {
        List<T> filteredList = new ArrayList<>();
        return filteredList = list.stream().filter(entity -> entity.getName().equals(name)).collect(Collectors.toList());
    }


}
