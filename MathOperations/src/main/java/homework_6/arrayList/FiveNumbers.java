package homework_6.arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class FiveNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 5, 3, 8, 5, 9);
        numbers.add(11);

        numbers.forEach(System.out::println);

    }
}
