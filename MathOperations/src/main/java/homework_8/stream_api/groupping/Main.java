package homework_8.stream_api.groupping;

//1. Группировка строк по первой букве
//Задача: Напишите программу, которая принимает список строк и группирует их по первой букве, используя Stream API.
//
//2. Группировка чисел по чётности
//Задача: Напишите программу, которая принимает список чисел и группирует их на чётные и нечётные, используя Stream API.
//
//        3. Поиск среднего значения чисел
//Задача: Напишите программу, которая принимает список чисел и находит их среднее значение, используя Stream API.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Hello", "Good", "Bad", "Hi", "Morning", "baby", "Mama"));
        Map<Character, List<String>> map = list.stream().collect(Collectors.groupingBy(str -> str.charAt(0)));
        map.entrySet().forEach(System.out::println);
        System.out.println();

        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 66, 33, 55, 11));
        Map<Boolean, List<Integer>> map2 = list2.stream().collect(Collectors.groupingBy(num -> num % 2 == 0));
        map2.entrySet().forEach(System.out::println);
        System.out.println();

        List<Integer> list3 = new ArrayList<>(Arrays.asList(1, 2, 3));
        double avg = list3.stream().collect(Collectors.averagingInt(num -> num));
        System.out.println(avg);
    }
}
