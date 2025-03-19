package data_structure.preparing.hashSet;

//Создайте HashSet из 5 чисел и выведите его содержимое.

import java.util.Collections;
import java.util.HashSet;

public class FiveNumbers {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        Collections.addAll(hashSet, 1, 2, 3, 4, 5, 6, 5, 4, 3);
        hashSet.forEach(System.out::println);

    }
}
