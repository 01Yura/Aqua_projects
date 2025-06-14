package no_bugs.practice_5.generics.task3;

//Работа с числами
//Задача: Создайте класс NumberBox<T extends Number>, который хранит только числа и возвращает их сумму.

import java.util.ArrayList;
import java.util.List;

public class GenericsNumbers {
    public static void main(String[] args) {

        NumberBox<Integer> box1 = new NumberBox<>();
        NumberBox<Double> box2 = new NumberBox<>();

        box1.addNumbers(1);
        box1.addNumbers(2);
        box1.addNumbers(3);

        box2.addNumbers(3.14);
        box2.addNumbers(3.15);
        box2.addNumbers(3.16);

        box1.getSum();
        box2.getSum();

        System.out.println(box1.getSum());
        System.out.println();
        System.out.println(box2.getSum());
    }
}

class NumberBox<T extends Number> {
    private List<T> list;


    public NumberBox() {
        this.list = new ArrayList<>();
    }

    public double getSum() {
        double sum = 0;
        for (T element : this.list) {
            sum += element.doubleValue();
        }
        return sum;
    }

    public void addNumbers(T number) {
        this.list.add(number);
    }
}