package homework_6.tasks.task4;

public class Task implements Comparable<Task> {
    private String taskName;
    private int taskPriority;


    public Task(String taskName, int taskPriority) {
        this.taskName = taskName;
        this.taskPriority = taskPriority;
    }

    @Override
    public int compareTo(Task o) {
        return this.taskPriority - o.taskPriority;
    }

    @Override
    public String toString() {
        return taskName + ", " + taskPriority;
    }
}
