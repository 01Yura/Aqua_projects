package no_bugs.data_structure.preparing.linkedHashSet;

import java.util.Collections;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        Collections.addAll(linkedHashSet, "Yura", "Boris", "Alisa", "Kevin", "Boris");
        System.out.println(linkedHashSet);
    }
}
