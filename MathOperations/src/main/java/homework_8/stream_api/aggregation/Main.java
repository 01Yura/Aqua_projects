package homework_8.stream_api.aggregation;

//1. Поиск максимального элемента
//Задача: Напишите программу, которая принимает список чисел и находит в нём самое большое число, используя Stream API.
//
//        2. Поиск минимального элемента
//Задача: Напишите программу, которая принимает список чисел и находит в нем наименьшее число, используя Stream API.
//
//3. Сумма всех элементов списка
//Задача: Напишите программу, которая принимает список чисел и вычисляет их сумму, используя Stream API.
//
//4. Поиск первого элемента, начинающегося на "Б"
//Задача: Напишите программу, которая принимает список строк и находит первую строку, начинающуюся на букву "Б", используя Stream API.
//
//5. Проверка наличия хотя бы одного элемента по условию
//Задача: Напишите программу, которая проверяет, есть ли хотя бы один элемент в списке, который удовлетворяет заданному условию (например, является чётным числом), используя Stream API.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(2, 6, 9, 12, 34, 87, 5, 9, 23, 88, 5));
        int a = list.stream().max((x, y) -> x - y).get();
        int b = list.stream().max(Comparator.naturalOrder()).get();
        int c = list.stream().max((x, y) -> x.compareTo(y)).get();
        int d = list.stream().max(Integer::compareTo).get();

        System.out.println(a);
        System.out.println();

        int e = list.stream().min(Comparator.naturalOrder()).get();
        System.out.println(e);
        System.out.println();

        int sum = list.stream().mapToInt(num -> num).sum();
        System.out.println(sum);
        System.out.println();

        List<String> stringList = new ArrayList<>(Arrays.asList("Матвей", "Борис", "Сергей", "Богдан"));
        String name = stringList.stream().filter(s -> s.startsWith("Б")).findFirst().get();
        System.out.println(name);
        System.out.println();


        List<Integer> list3 = new ArrayList<>(Arrays.asList(23, 3, 5, 2));
        boolean isEven = list3.stream().anyMatch(num -> num % 2 == 0);
        System.out.println(isEven);

    }
}
