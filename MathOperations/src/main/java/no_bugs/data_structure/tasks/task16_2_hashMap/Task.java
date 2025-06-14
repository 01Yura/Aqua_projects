package no_bugs.data_structure.tasks.task16_2_hashMap;

public class Task {
    String taskName;
    Double deadline;

    public Task(String taskName, Double deadline) {
        this.taskName = taskName;
        this.deadline = deadline;
    }

    public String getTaskName() {
        return taskName;
    }

    public Double getDeadline() {
        return deadline;
    }

    @Override
    public String toString() {
        return "Task: " + taskName + " " + deadline;
    }
}
