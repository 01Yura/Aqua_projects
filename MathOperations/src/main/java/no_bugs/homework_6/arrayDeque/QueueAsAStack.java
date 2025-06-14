package no_bugs.homework_6.arrayDeque;

import java.util.ArrayDeque;

public class QueueAsAStack {
    public static void main(String[] args) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        stack.offer(1);
        stack.offer(2);
        stack.offer(3);
        stack.offer(4);
        stack.offer(5);

        System.out.println(stack);

        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());
        System.out.println(stack);
    }
}
