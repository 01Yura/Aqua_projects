package homework_6.arrayDeque;

import java.util.ArrayDeque;

public class QueueExample {
    public static void main(String[] args) {
        ArrayDeque<Integer> queue = new ArrayDeque<>();

        queue.offer(1);
        queue.offer(2);
        System.out.println(queue);

        queue.offerFirst(0);
        queue.offerLast(3);
        System.out.println(queue);

        System.out.println(queue.pollFirst());
        System.out.println(queue.pollLast());
        System.out.println(queue);
    }
}
