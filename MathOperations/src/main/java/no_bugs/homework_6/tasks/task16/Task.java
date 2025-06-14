package no_bugs.homework_6.tasks.task16;

public class Task implements Comparable<Task> {
    private String taskName;
    private Double taskDeadline;

    public Task(String taskName, Double taskDeadline) {
        this.taskName = taskName;
        this.taskDeadline = taskDeadline;
    }

    public String getTaskName() {
        return taskName;
    }

    public Double getTaskDeadline() {
        return taskDeadline;
    }

    @Override
    public int compareTo(Task o) {
        return (int) (this.taskDeadline - o.taskDeadline);
    }

    @Override
    public String toString() {
        return taskName + " " + taskDeadline;
    }
}
