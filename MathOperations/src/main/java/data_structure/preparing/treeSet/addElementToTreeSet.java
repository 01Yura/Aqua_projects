package data_structure.preparing.treeSet;

//Напишите метод, который добавляет числа в TreeSet, но не позволяет добавить дубликаты.

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class addElementToTreeSet {
    public static <T> void addElement(Set<T> set, T num) {
        set.add(num);
    }


    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        Collections.addAll(treeSet, 11, 77);
        addElement(treeSet, 4);
        addElement(treeSet, 2);
        addElement(treeSet, 3);
        addElement(treeSet, 1);
        addElement(treeSet, 2);
        addElement(treeSet, 4);
        addElement(treeSet, 1);

        System.out.println(treeSet);

    }
}
