package no_bugs.data_structure.preparing.arrayDeque;

import java.util.ArrayDeque;

public class AsQueue {
    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.addFirst(3);
        System.out.println(arrayDeque);
        arrayDeque.addLast(4);
        System.out.println(arrayDeque);
        arrayDeque.addFirst(2);
        System.out.println(arrayDeque);
        arrayDeque.addLast(5);
        System.out.println(arrayDeque);
        arrayDeque.addFirst(1);
        System.out.println(arrayDeque);
        arrayDeque.addLast(6);
        System.out.println(arrayDeque);

        while (!arrayDeque.isEmpty()) {
            System.out.println(arrayDeque.pollFirst());
            System.out.println(arrayDeque.pollLast());
        }

    }
}
