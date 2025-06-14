package no_bugs.practice_6.stream_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

//Задача 1: Поиск максимального элемента
//Задача 2: Поиск минимального элемента

public class MaxElement {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(34, 4, 5, 6, 7, 88, 33, 22, 19, 18, 17));

        int max = arrayList.stream().max((x, y) -> x - y).get();
        System.out.println(max);

        int min = arrayList.stream().min(Comparator.naturalOrder()).get();
        System.out.println(min);

    }
}
