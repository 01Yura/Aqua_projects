package task6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TaskService<T> {
    private List<Task<T>> list;

    public TaskService() {
        this.list = new ArrayList<>();
    }

    public synchronized boolean addTask(Task<T> task) {
        if (list.contains(task)) {
            System.out.println("Task is already in list");
            return false;
        }
        return list.add(task);
    }

    public List<Task<T>> getList() {
        return list;
    }

    public synchronized boolean removeTask(T id) {
        return list.removeIf(task -> task.getId().equals(id));
    }


    public synchronized List<Task<T>> filterByStatus(Status status) {
        return list = list.stream().filter(task -> task.getStatus().equals(status)).toList();
    }


    public synchronized List<Task<T>> filterByPriority(Priority priority) {
        return list = list.stream().filter(task -> task.getPriority().equals(priority)).toList();
    }


    public synchronized List<Task<T>> sortByDate() {
        return list = list.stream().sorted(Comparator.comparing(Task::getDeadline)).toList();
    }
}
