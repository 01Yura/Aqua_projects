package data_structure.tasks.task15;

import java.util.ArrayDeque;
import java.util.Queue;

//15. Структура электронной очереди
//В поликлинике пациенты записываются в очередь, и каждый должен быть вызван в порядке записи.

public class Main {
    public static void main(String[] args) {
//        Create queue
        Queue<Integer> storage = new ArrayDeque<>();
//        Populate it (pacient takes the ticket)
        storage.offer(1);
        storage.offer(2);
        storage.offer(3);
        storage.offer(4);
        storage.offer(5);
//        Print current queue
        System.out.println(storage);
        System.out.println();
//        Doctor sees patient marking the ticket as used
        storage.poll();
        storage.poll();
//        Print current queue
        System.out.println(storage);
    }
}
