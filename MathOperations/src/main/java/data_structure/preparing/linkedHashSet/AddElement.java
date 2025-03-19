package data_structure.preparing.linkedHashSet;

//Напишите метод, который добавляет элемент в LinkedHashSet, но не добавляет дубликаты.

import java.util.Collections;
import java.util.LinkedHashSet;

public class AddElement {
    public static void addUniqueElement(LinkedHashSet<Integer> set, Integer num) {
        set.add(num);
        System.out.println(set);
    }

    public static void main(String[] args) {
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        Collections.addAll(linkedHashSet, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
        System.out.println(linkedHashSet);

        addUniqueElement(linkedHashSet, 11);
        addUniqueElement(linkedHashSet, 9);
    }
}
