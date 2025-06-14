package no_bugs.practice_5.generics.task4;

//Ограничение сверху
//Задача: Напишите обобщённый метод, который принимает List<? extends Number> и вычисляет сумму элементов.

import java.util.ArrayList;
import java.util.List;

public class UpperBoundedClass {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Double> list2 = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);

        list2.add(3.14);
        list2.add(3.15);
        list2.add(3.16);


        calculateSum(list1);
        System.out.println();
        calculateSum(list2);

    }

    public static void calculateSum(List<? extends Number> list) {
        double sum = 0;
        for (Number element : list) {
            sum += element.doubleValue();
        }
        System.out.println(sum);
    }
}


