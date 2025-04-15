package homework_8.stream_api.basic_operations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        /*1. Фильтрация строк по длине больше 5
        Задача: Напишите программу, которая принимает список строк и удаляет из него все строки длиной 5 символов и менее, используя Stream API.

        2. Фильтрация чисел, кратных 5
        Задача: Напишите программу, которая принимает список чисел и отбирает только те, которые делятся на 5 без остатка, используя Stream API.

        3. Преобразование строк в их длины
        Задача: Напишите программу, которая принимает список строк и заменяет каждую строку на её длину, используя Stream API.

        4. Создание списка квадратов чисел
        Задача: Напишите программу, которая принимает список чисел и преобразует его в новый список, где каждое число заменено на его квадрат, используя Stream API.

        5. Удаление дубликатов из списка
        Задача: Напишите программу, которая принимает список элементов и удаляет из него все дубликаты, используя Stream API.*/


        List<String> list = new ArrayList<>(Arrays.asList("Hello", "How are you?", "Good morning", "OK"));

        list.stream().filter(s -> s.length() > 5).forEach(System.out::println);

        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 5, 7, 5, 13, 36, 1, 67, 7));

        list2.stream().filter(num -> num % 5 == 0).forEach(System.out::println);
        System.out.println();

        list.stream().map(str -> str.length()).forEach(System.out::println);
        System.out.println();

        List<Integer> list3 = list2.stream().map(num -> num * num).collect(Collectors.toList());
        System.out.println(list3);
        System.out.println();

        list2.stream().distinct().forEach(System.out::println);


    }
}
