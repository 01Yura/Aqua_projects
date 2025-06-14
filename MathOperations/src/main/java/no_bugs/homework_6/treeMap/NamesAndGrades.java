package no_bugs.homework_6.treeMap;

import java.util.TreeMap;

public class NamesAndGrades {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        treeMap.put("Yura", 3);
        treeMap.put("Max", 2);
        treeMap.put("Sveta", 5);
        treeMap.put("Bogdan", 4);
        treeMap.put("Vasya", 1);

        System.out.println(treeMap);
        System.out.println();

        treeMap.entrySet().forEach(System.out::println);
        System.out.println();

        System.out.println(treeMap.firstKey());
        System.out.println(treeMap.lastKey());
        System.out.println();
        TreeMap<Integer, String> employes = new TreeMap<>();

        employes.put(5, "Yura");
        employes.put(3, "Max");
        employes.put(4, "Sveta");
        employes.put(2, "Kolya");

        System.out.println(employes);

        System.out.println(employes.higherKey(3));
    }
}
