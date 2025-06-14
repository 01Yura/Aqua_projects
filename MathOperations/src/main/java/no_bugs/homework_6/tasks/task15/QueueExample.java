package no_bugs.homework_6.tasks.task15;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();

        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);

        System.out.println(queue);
        System.out.println();

        queue.poll();

        System.out.println(queue);
        System.out.println();


    }
}
