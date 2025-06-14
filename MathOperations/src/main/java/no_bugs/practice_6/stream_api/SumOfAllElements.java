package no_bugs.practice_6.stream_api;

import java.util.ArrayList;
import java.util.Arrays;

//Задача 3: Сумма всех элементов списка

public class SumOfAllElements {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        int sum = arrayList.stream().mapToInt(element -> element).sum();
        System.out.println(sum);
    }
}
