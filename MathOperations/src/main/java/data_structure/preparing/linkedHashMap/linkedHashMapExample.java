package data_structure.preparing.linkedHashMap;

//Создайте LinkedHashMap и добавьте в него 5 элементов. Выведите их в порядке добавления.

import java.util.LinkedHashMap;

public class linkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("Yura", 39);
        linkedHashMap.put("Masha", 15);
        linkedHashMap.put("Sveta", 17);
        linkedHashMap.put("Petya", 18);
        linkedHashMap.put("Max", 27);

        System.out.println(linkedHashMap);
        System.out.println();

        // Без типа данных для entry
        linkedHashMap.entrySet().forEach(entry -> System.out.println(entry));

        // Вообще не указываем ничего, просто пишем soutc
        linkedHashMap.entrySet().forEach(System.out::println);

    }
}
