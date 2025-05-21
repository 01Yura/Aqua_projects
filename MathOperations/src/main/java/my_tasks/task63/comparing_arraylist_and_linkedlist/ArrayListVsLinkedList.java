package my_tasks.task63.comparing_arraylist_and_linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListVsLinkedList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        int num = 0;
        while (arrayList.size() < 1_000 && linkedList.size() < 1_000) {
            arrayList.add(num++);
            linkedList.add(num++);
        }

        long startTime = System.nanoTime();
        int count = 1_000;
        while (count > 0) {
            arrayList.add(0, num++);
            count--;
        }
        long endTime = System.nanoTime();

        long startTime2 = System.nanoTime();
        int count2 = 1_000;
        while (count2 > 0) {
            linkedList.add(0, num++);
            count2--;
        }
        long endTime2 = System.nanoTime();

        long timeForArrayList = endTime - startTime;
        long timeForLinkedList = endTime2 - startTime2;

        System.out.println("timeForArrayList = " + timeForArrayList);
        System.out.println("timeForLinkedList = " + timeForLinkedList);
        System.out.println(arrayList);
        System.out.println(linkedList);

    }


}
