package task6;

import java.time.LocalDate;
import java.util.Objects;

public class Task<T> {
    private T id;
    private Status status;
    private Priority priority;
    private LocalDate deadline;

    public Task(T id, Status status, Priority priority, String deadline) {
        this.id = id;
        this.status = status;
        this.priority = priority;
        this.deadline = LocalDate.parse(deadline);
    }

    public T getId() {
        return id;
    }

    public Status getStatus() {
        return status;
    }

    public Priority getPriority() {
        return priority;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (this.getClass() != o.getClass()) return false;
        Task task = (Task) o;
        if (this.getId().equals(task.getId())) return true;
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", status=" + status +
                ", priority=" + priority +
                ", deadline=" + deadline +
                '}';
    }
}



