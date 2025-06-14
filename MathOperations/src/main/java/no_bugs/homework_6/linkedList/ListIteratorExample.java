package no_bugs.homework_6.linkedList;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        Collections.addAll(numbers, 1, 2, 3, 4, 5);

        ListIterator<Integer> listIterator = numbers.listIterator();
        ListIterator<Integer> reverseListIterator = numbers.listIterator(numbers.size());

        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
        System.out.println();

        while (reverseListIterator.hasPrevious()) {
            System.out.println(reverseListIterator.previous());
        }
    }
}
