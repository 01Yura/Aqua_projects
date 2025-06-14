package no_bugs.homework_6.arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class OddNumbersRemover {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        Collections.addAll(numbers, 2, 5, 8, 33, 67, 44, 98, 97, 1);
        numbers.removeIf(number -> number % 2 == 0);

        numbers.forEach(System.out::println);
    }
}
