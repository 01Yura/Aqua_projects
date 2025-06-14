package no_bugs.practice_6.stream_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//1. Фильтрация строк по длине больше 5

public class FilterStrings {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        String str = "Hello, my name is Bubakar Kumar. I am a QA Engineer at Google company.";
        str = str.replaceAll("[\\s,.]+", " ");
        String[] array = str.split(" ");
        System.out.println(Arrays.toString(array));
        list = Arrays.asList(array);
        System.out.println(list);
        System.out.println();

        list = list.stream().filter(string -> string.length() > 5).collect(Collectors.toList());

        System.out.println(list);

    }
}
