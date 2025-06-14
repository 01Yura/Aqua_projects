package no_bugs.data_structure.preparing.arrayList;

import java.util.ArrayList;
import java.util.Collections;

//Создайте ArrayList из целых чисел. Напишите программу, которая вычисляет и выводит сумму всех чисел в списке.

public class WholeNumbers4 {
    public static void main(String[] args) {
        ArrayList<Integer> myArrayList = new ArrayList<>();
        Collections.addAll(myArrayList, 1, 2, 3, 4, 5);
        System.out.println(myArrayList);

        int sum = 0;
        for (Integer number : myArrayList) {
            sum += number;
        }
        System.out.println(sum);
    }
}
