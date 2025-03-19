package data_structure.preparing.arrayList;

//Создайте ArrayList из целых чисел. Напишите программу, которая находит и выводит максимальное число из списка.

import java.util.ArrayList;
import java.util.Collections;

public class MaxNumber5 {
    public static void main(String[] args) {
        ArrayList<Integer> myArrayList = new ArrayList<>();
        Collections.addAll(myArrayList, 1, 2, 3, 4, 5, 0, 9, 8, 7, 6, 5);
        System.out.println(myArrayList);

        int maxNumber = myArrayList.get(0);
        for (Integer number : myArrayList) {
            if (number > maxNumber) {
                maxNumber = number;
            }
        }
        System.out.println(maxNumber);
    }
}
