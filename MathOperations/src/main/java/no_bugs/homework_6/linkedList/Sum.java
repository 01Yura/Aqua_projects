package no_bugs.homework_6.linkedList;

import java.util.Collections;
import java.util.LinkedList;

public class Sum {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        Collections.addAll(numbers, 1, 2, 3, 4, 5);

        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        System.out.println(sum);
    }
}
