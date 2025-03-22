package homework_6.tasks.task16;


import java.util.Collections;
import java.util.LinkedList;

public class Storage {
    private LinkedList<Task> listOFTasks;


    public Storage() {
        listOFTasks = new LinkedList<>();
    }

    public void addTask(Task task) {
        this.listOFTasks.add(task);
    }

    public void removeTask(Task task) {
        this.listOFTasks.remove(task);
    }

    public void print() {
        this.listOFTasks.forEach(System.out::println);
    }

    public void sortByDeadline() {
        Collections.sort(this.listOFTasks);
    }


}
