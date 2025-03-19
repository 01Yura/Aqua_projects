package data_structure.preparing.linkedList;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

//Используйте ListIterator для прохода по LinkedList в обоих направлениях.

public class ListIteratorExample {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        Collections.addAll(linkedList, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
        System.out.println(linkedList);
        System.out.println();

        ListIterator<Integer> iterator = linkedList.listIterator();
        ListIterator<Integer> reverseIterator = linkedList.listIterator(linkedList.size());

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();
        while (reverseIterator.hasPrevious()) {
            System.out.println(reverseIterator.previous());
        }
    }
}
