package data_structure.preparing.arrayDeque;

import java.util.ArrayDeque;

//Создайте ArrayDeque, добавьте 5 элементов и выведите их.

public class FiveElements {
    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.offer(3);
        arrayDeque.offer(2);
        arrayDeque.offer(1);
        arrayDeque.offer(99);
        arrayDeque.offer(100);

        System.out.println(arrayDeque);
        arrayDeque.forEach(System.out::println);
    }
}
