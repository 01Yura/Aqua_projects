package no_bugs.data_structure.preparing.treeMap;

import java.util.TreeMap;

//Создайте TreeMap и добавьте 5 ключей (имена) и значений (баллы). Выведите отсортированные данные.

public class KeyPlusValues {
    public static void main(String[] args) {
        TreeMap<String, Integer> journal = new TreeMap<>();
        journal.put("Yura", 4);
        journal.put("Max", 2);
        journal.put("Slava", 1);
        journal.put("Anna", 3);
        journal.put("Egor", 4);

        System.out.println(journal);

        journal.entrySet().forEach(System.out::println);
    }
}
