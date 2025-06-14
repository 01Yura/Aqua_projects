package no_bugs.data_structure.preparing.linkedList;

//Создайте LinkedList из целых чисел. Напишите программу, которая вычисляет сумму элементов списка.

import java.util.Collections;
import java.util.LinkedList;

public class CalculateSum {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        Collections.addAll(linkedList, 1, 2, 3, 4, 5);
        System.out.println(linkedList);

        Integer sum = 0;
        for (Integer num : linkedList) {
            sum += num;
        }
        System.out.println(sum);


    }
}
