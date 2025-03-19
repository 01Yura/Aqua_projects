package homework_6.priorityQueue;

import java.util.PriorityQueue;

public class FiveNumbers {
    public static void main(String[] args) {
        PriorityQueue<Integer> numbers = new PriorityQueue<>();

        numbers.add(4);
        numbers.add(1);
        numbers.add(3);
        numbers.add(5);
        numbers.add(2);

        while (!numbers.isEmpty()) {
            System.out.println(numbers.poll());
        }
    }
}
