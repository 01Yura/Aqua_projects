package no_bugs.homework_6.linkedHashSet;

import java.util.Collections;
import java.util.LinkedHashSet;

public class FiveStrings {
    public static void main(String[] args) {
        LinkedHashSet<String> strings = new LinkedHashSet<>();
        Collections.addAll(strings, "1", "2", "3", "4", "5");

        strings.add("6");

        strings.forEach(System.out::println);
    }
}
