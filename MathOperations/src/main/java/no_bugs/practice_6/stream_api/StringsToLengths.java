package no_bugs.practice_6.stream_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//3. Преобразование строк в их длины

public class StringsToLengths {
    public static void main(String[] args) {
        String str = "Hello, my name is Bubakar Kumar. I am a QA Engineer at Google company.";
        String[] array = str.replaceAll("[\\s,.]+", " ").split(" ");
        System.out.println(Arrays.toString(array));
        System.out.println();

        List<String> list = new ArrayList<>(Arrays.asList(array));
        System.out.println(list);

//        метод map() принимает String, но возвращает Integer, поэтому List должен быть <Integer>
        List<Integer> integerList = list.stream().map(string -> string.length()).toList();
        System.out.println(integerList);

    }
}
