package no_bugs.data_structure.preparing.priorityQueue;

//Реализуйте очередь задач с приоритетами. Добавьте несколько задач и извлеките их по приоритету.

import java.util.Map;
import java.util.PriorityQueue;

public class QueueOfTasks {
    public static void main(String[] args) {
        PriorityQueue<Map.Entry<Integer, String>> queue = new PriorityQueue<>(Map.Entry.comparingByKey());
        queue.add(Map.entry(3, "Зависнуть"));
        queue.add(Map.entry(1, "Обкуриться в хлам"));
        queue.add(Map.entry(2, "Созвон с кентами"));

        System.out.println(queue);
        System.out.println();

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
        // Тут лучше обьект создавать, чтобы не усложнять

    }
}
