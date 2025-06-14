package no_bugs.data_structure.tasks.task4;

class Task implements Comparable<Task> {
    String title;
    int priority;

    public Task(String title, int priority) {
        this.title = title;
        this.priority = priority;
    }

    @Override
    public int compareTo(Task o) {
        int result;
        result = this.priority - o.priority;
        return result;
    }

    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", priority=" + priority +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public int getPriority() {
        return priority;
    }
}
