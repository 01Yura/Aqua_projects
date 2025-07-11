package no_bugs.homework_6.linkedList;

import java.util.Collections;
import java.util.LinkedList;

public class StringRemover {
    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList<>();
        Collections.addAll(strings, "Hello", "Good morning", "How are you?", "Bay", "Good bay");
        strings.forEach(System.out::println);
        System.out.println();

        strings.removeFirst();
        strings.forEach(System.out::println);
        System.out.println();
        strings.removeLast();
        strings.forEach(System.out::println);

    }
}
