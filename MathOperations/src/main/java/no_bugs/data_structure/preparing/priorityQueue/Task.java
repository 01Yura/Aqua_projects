package no_bugs.data_structure.preparing.priorityQueue;

import java.util.PriorityQueue;

//Используйте PriorityQueue для сортировки объектов по приоритету.

public class Task implements Comparable<Task> {
    private String taskName;
    private int taskPriority;

    public Task(String taskName, int taskPriority) {
        this.taskName = taskName;
        this.taskPriority = taskPriority;
    }

    public static void main(String[] args) {
        Task task1 = new Task("Smoke", 2);
        Task task2 = new Task("Sleep", 1);
        Task task3 = new Task("Eat", 3);
        Task task4 = new Task("Work", 4);

        PriorityQueue<Task> queue = new PriorityQueue<>();
        queue.add(task1);
        queue.add(task2);
        queue.add(task3);
        queue.add(task4);

        System.out.println(queue);

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }

    @Override
    public String toString() {
        return " taskName " + taskName + ", taskPriority " + taskPriority;
    }

    @Override
    public int compareTo(Task o) {
        return Integer.compare(this.taskPriority, o.taskPriority);
    }

}
