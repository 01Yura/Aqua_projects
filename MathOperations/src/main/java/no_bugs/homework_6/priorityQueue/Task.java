package no_bugs.homework_6.priorityQueue;

import java.util.PriorityQueue;

public class Task implements Comparable<Task> {
    String name;
    int priority;

    public Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public static void main(String[] args) {
        PriorityQueue<Task> tasks = new PriorityQueue<>();

        tasks.add(new Task("Sleep", 4));
        tasks.add(new Task("Wake up", 1));
        tasks.add(new Task("Wash my hand", 2));
        tasks.add(new Task("Go for a walk", 3));

        System.out.println(tasks);
        System.out.println();
        System.out.println(tasks.poll());
        System.out.println(tasks.poll());
        System.out.println(tasks.poll());
        System.out.println(tasks.poll());
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", priority=" + priority +
                '}';
    }

    @Override
    public int compareTo(Task o) {
        return this.priority - o.priority;
    }


}
