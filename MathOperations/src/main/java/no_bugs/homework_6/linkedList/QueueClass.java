package no_bugs.homework_6.linkedList;

import java.util.LinkedList;

public class QueueClass {
    public static void main(String[] args) {
        LinkedList<String> tasks = new LinkedList<>();
        tasks.offer("Wake up");
        tasks.offer("Wash my face");
        tasks.offer("Have a coffee");

        System.out.println(tasks);
        System.out.println();

        System.out.println(tasks.poll());
        System.out.println(tasks.poll());
        System.out.println(tasks.poll());

        tasks.forEach(System.out::println);
        System.out.println(tasks.isEmpty());
    }
}
