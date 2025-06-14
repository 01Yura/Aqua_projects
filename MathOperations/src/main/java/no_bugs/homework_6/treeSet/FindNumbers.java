package no_bugs.homework_6.treeSet;

import java.util.Collections;
import java.util.TreeSet;

public class FindNumbers {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        Collections.addAll(numbers, 1, 3, 5, 7, 9, 2, 4, 45, 67, 89, 32, 54, 87, 36, 797, 3, 5, 8, 1, 0, 56);
        System.out.println(numbers);
        System.out.println();
        int number = 100;

        if (numbers.contains(number)) {
            System.out.println("The nearest lower number to " + number + " is " + numbers.lower(number));
            System.out.println("The nearest higher number to " + number + " is " + numbers.higher(number));
        } else {
            System.out.println("This number is not in the set");
        }
    }
}
