package data_structure.preparing.treeMap;

import java.util.TreeMap;


//Найдите минимальный и максимальный ключ в TreeMap.

public class MaxAndMinKey {
    public static void main(String[] args) {
        TreeMap<String, Integer> journal = new TreeMap<>();
        journal.put("Yura", 4);
        journal.put("Max", 2);
        journal.put("Slava", 1);
        journal.put("Anna", 3);
        journal.put("Egor", 4);

        System.out.println(journal);

        System.out.println("Минимальный ключ: " + journal.firstKey());
        System.out.println("Максимальный ключ: " + journal.lastKey());


    }
}
