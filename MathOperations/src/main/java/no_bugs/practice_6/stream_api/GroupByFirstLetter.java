package no_bugs.practice_6.stream_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//1. Группировка строк по первой букве

public class GroupByFirstLetter {
    public static void main(String[] args) {
        String str = "Hello, my name is Gubakar Humar. I am a QA Engineer at Google company.";
        String[] array = str.replaceAll("[\\s,.]+", " ").split(" ");
        System.out.println(Arrays.toString(array));
        System.out.println();

        List<String> list = new ArrayList<>(Arrays.asList(array));
        System.out.println(list);

//        Метод collect возвращает нам map, где ключем является то, по чему мы сортировали, а значением - список всех подходящих слов
        Map<Character, List<String>> map = list.stream().collect(Collectors.groupingBy(element -> element.charAt(0)));
        System.out.println(map);
        System.out.println();

        map.entrySet().forEach(System.out::println);
    }
}

