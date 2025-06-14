package no_bugs.practice_6.stream_api;

//2. Фильтрация чисел, кратных 5

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 4, 5, 11, 15, 19, 20, 21, 24));

//        Метод toList() в конце создает неизменяемый список, если надо изменяемый то надо использовать collect(Collectors.toList())
        List<Integer> list = arrayList.stream().filter(number -> number % 5 == 0).toList();
        list.forEach(System.out::println);

    }
}
