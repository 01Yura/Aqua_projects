package no_bugs.homework_6.treeSet;

import java.util.Collections;
import java.util.TreeSet;

public class FiveNumbers {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        Collections.addAll(treeSet, 1, 5, 8, 33, 2, 7, 99, 5, 33, 99, 100);

        treeSet.forEach(System.out::println);
    }
}
