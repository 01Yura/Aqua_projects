package no_bugs.homework_6.arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Sum {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1, 2, 3, 4, 5);

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println(sum);
    }
}
