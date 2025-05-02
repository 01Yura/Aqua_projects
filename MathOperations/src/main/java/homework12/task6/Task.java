package homework12.task6;

import java.time.LocalDate;
import java.util.Objects;

public class Task<T extends Number> {
    private final T id;
    private String status;
    private String priority;
    private LocalDate date;

    public Task(T id, String status, String priority, String date) {
        this.id = id;
        this.status = status;
        this.priority = priority;
        this.date = LocalDate.parse(date);
    }

    public T getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public String getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", status='" + status + '\'' +
                ", priority='" + priority + '\'' +
                ", date='" + date + '\'' +
                '}';
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Task<?> task)) return false;
        return Objects.equals(getId(), task.getId()) && Objects.equals(getStatus(), task.getStatus()) && Objects.equals(getPriority(), task.getPriority()) && Objects.equals(getDate(), task.getDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getStatus(), getPriority(), getDate());
    }
}
