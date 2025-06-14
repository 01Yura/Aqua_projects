package no_bugs.data_structure.preparing.priorityQueue;

import java.util.Collections;
import java.util.PriorityQueue;

//Создайте PriorityQueue и добавьте 5 чисел. Выведите их в порядке удаления.

public class Show5Numbers {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        Collections.addAll(priorityQueue, 2, 5, 8, 4, 1);
        System.out.println(priorityQueue);

//        int queueSize = priorityQueue.size();
//        for (int i = 0; i < queueSize; i++) {
//            System.out.println(priorityQueue.poll());

        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }
    }
}

