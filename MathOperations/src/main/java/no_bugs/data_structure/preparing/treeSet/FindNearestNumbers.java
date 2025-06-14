package no_bugs.data_structure.preparing.treeSet;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

//Найдите ближайшее большее и меньшее число к заданному в TreeSet.

public class FindNearestNumbers {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        Collections.addAll(treeSet, 2, 5, 8, 12, 56, 23, 89, 5, 3, 9, 34, 0, 21, 45, 87, 43, 56, 78, 1, 5, 8, 9, 5, 4, 3, 90, 11, 15, 16, 18, 32, 43, 54, 65, 76);
        System.out.println("Множество: " + treeSet);

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (treeSet.contains(num)) {
            System.out.println("Соседнее меньшее число: " + treeSet.lower(num));
            System.out.println("Соседнее большее число: " + treeSet.higher(num));
        } else {
            System.out.println("Данного числа нет в множестве");
        }
    }
}

