package my_tasks.task63.comparing_arraylist_and_linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MiddleInsertionBenchmark {

    private static final int ELEMENT_COUNT = 100_000;

    public static void main(String[] args) {

        // ArrayList
        List<Integer> arrayList = new ArrayList<>();
        long arrayListStart = System.nanoTime();
        for (int i = 0; i < ELEMENT_COUNT; i++) {
            arrayList.add(arrayList.size() / 2, i); // вставка в середину
        }
        long arrayListEnd = System.nanoTime();
        System.out.println("ArrayList вставка в середину: " + (arrayListEnd - arrayListStart) / 1_000_000.0 + " ms");

        // LinkedList
        List<Integer> linkedList = new LinkedList<>();
        long linkedListStart = System.nanoTime();
        for (int i = 0; i < ELEMENT_COUNT; i++) {
            linkedList.add(linkedList.size() / 2, i); // вставка в середину
        }
        long linkedListEnd = System.nanoTime();
        System.out.println("LinkedList вставка в середину: " + (linkedListEnd - linkedListStart) / 1_000_000.0 + " ms");


        System.out.println("------------------------------------");


        List<Integer> arrayList2 = new ArrayList<>();
        long arrayListStart2 = System.nanoTime();
        for (int i = 0; i < ELEMENT_COUNT; i++) {
            arrayList2.add(0, i); // вставка в начало
        }
        long arrayListEnd2 = System.nanoTime();
        System.out.println("ArrayList вставка в начало: " + (arrayListEnd2 - arrayListStart2) / 1_000_000.0 + " ms");

        // LinkedList
        List<Integer> linkedList2 = new LinkedList<>();
        long linkedListStart2 = System.nanoTime();
        for (int i = 0; i < ELEMENT_COUNT; i++) {
            linkedList2.add(0, i); // вставка в начало
        }
        long linkedListEnd2 = System.nanoTime();
        System.out.println("LinkedList вставка в начало: " + (linkedListEnd2 - linkedListStart2) / 1_000_000.0 + " ms");
    }
}

