package no_bugs.data_structure.preparing.hashSet;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

//Реализуйте метод, который принимает List<String> и возвращает Set<String> без дубликатов.

public class NoDublicatesMethod {
    public static HashSet<String> removeDuplicates(List<String> list) {
        HashSet<String> hashSet = new HashSet<>(list);
        return hashSet;
    }


    public static void main(String[] args) {
        List<String> linkedList = new LinkedList<>();
        Collections.addAll(linkedList, "1", "2", "3", "2", "4", "5", "3", "5", "6", "7");
        System.out.println(linkedList);

        System.out.println(removeDuplicates(linkedList));

    }
}
