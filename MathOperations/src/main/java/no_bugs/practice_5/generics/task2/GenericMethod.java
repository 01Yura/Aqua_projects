package no_bugs.practice_5.generics.task2;
//
//Обобщённый метод
//Задача: Реализуйте метод printList(List<T>), который принимает список любого типа и выводит его элементы.

import java.util.LinkedList;
import java.util.List;

public class GenericMethod {
    public static void main(String[] args) {
        List<Integer> list1 = new LinkedList<>();
        List<String> list2 = new LinkedList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);

        list2.add("Hello");
        list2.add("Hi");
        list2.add("Bay");

        printList(list1);
        System.out.println();
        printList(list2);


    }

    public static <T> void printList(List<T> list) {
        list.forEach(System.out::println);
    }

}
