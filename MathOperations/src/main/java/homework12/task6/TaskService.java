package homework12.task6;

import java.util.*;

// add, remove, search

public class TaskService<T extends Number> {
    private Map<T, Task<T>> map;

    public TaskService() {
        this.map = new HashMap<>();
    }

    public void addTask(Task<T> task) {
        map.put(task.getId(), task);
    }

    public void printTasks() {
        map.entrySet().forEach(System.out::println);
    }

    public boolean removeTask(T id) {
        return map.entrySet().removeIf(entry -> entry.getValue().getId().equals(id));
    }

    public Task<T> searchById(T id) {
        return map.get(id);
    }

    public List<Task<T>> sortByDate() {
        List<Task<T>> list = new ArrayList<>();
        for (Map.Entry<T, Task<T>> entry : map.entrySet()) {
            list.add(entry.getValue());
        }

        list.sort(Comparator.comparing(Task::getDate));
        return list;
    }

    public List<Task<T>> sortByDateUsingStream() {
        return map.values().stream().sorted((e1, e2) -> e1.getDate().compareTo(e2.getDate())).toList();
    }

}
