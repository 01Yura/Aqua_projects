package homework_6.hashSet;

import java.util.Collections;
import java.util.HashSet;

public class FiveNumbers {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        Collections.addAll(numbers, 1, 2, 3, 4, 5);
        numbers.forEach(System.out::println);
    }
}
