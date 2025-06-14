package no_bugs.practice_5.generics.task5;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundedClass {
    public static void main(String[] args) {
        List<Object> objectList = new ArrayList<>();
        objectList.add(new Object());
        objectList.add(new Object());
        objectList.add(new Object());
        addNumbers(objectList);
        print(objectList);
        System.out.println();

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        addNumbers(integerList);
        print(integerList);
    }

    public static void addNumbers(List<? super Integer> list) {
        list.add(4);
        list.add(5);
        list.add(6);
    }

    public static void print(List<? super Integer> list) {
        list.forEach(System.out::println);
    }

}