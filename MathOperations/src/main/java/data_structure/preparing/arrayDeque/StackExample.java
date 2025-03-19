package data_structure.preparing.arrayDeque;

import java.util.ArrayDeque;
import java.util.Collections;

//Используйте ArrayDeque как стек: добавьте элементы и извлеките их в обратном порядке.

public class StackExample {
    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        Collections.addAll(arrayDeque, 5, 4, 3, 2, 1);
        System.out.println(arrayDeque);

        while (!arrayDeque.isEmpty()) {
            System.out.println(arrayDeque.pollLast());
        }
    }
}
