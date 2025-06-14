package no_bugs.data_structure.preparing.treeSet;

//Создайте TreeSet из 5 чисел и выведите его. Обратите внимание на порядок.

import java.util.Collections;
import java.util.TreeSet;

public class TreeSet5Numbers {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        Collections.addAll(treeSet, 5, 8, 2, 4, 9, 0, 1, 2, 7, 4, 8, 5, 2, 4, 6, 8, 9, 0, 5, 6, 7, 8, 3, 4, 5, 2, 1, 6, 8, 9, 2);
        System.out.println(treeSet);
    }

}
