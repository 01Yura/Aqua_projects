package my_tasks.sort_hashmap;

import java.util.*;

public class SortHashMapEx {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "e");
        hashMap.put(2, "c");
        hashMap.put(4, "b");
        hashMap.put(3, "d");
        hashMap.put(5, "a");

        hashMap.forEach((integer, string) -> System.out.println(integer + " " + string));

        System.out.println("----------with TreeMap----------------");

        TreeMap<String, Integer> sortedMap = new TreeMap<>();
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            String key = entry.getValue();
            Integer value = entry.getKey();
            sortedMap.put(key, value);
        }

        sortedMap.forEach((string, integer) -> System.out.println(string + " " + integer));

        System.out.println("------------with List--------------");

        List<Map.Entry<Integer, String>> list = hashMap.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue)).toList();
        list.forEach(System.out::println);

        System.out.println("------------with LinkedHashMap--------------");
        LinkedHashMap<String, Integer> sortedMap2 = new LinkedHashMap<>();

        for (Map.Entry<Integer, String> entry : list) {
            String key = entry.getValue();
            Integer value = entry.getKey();
            sortedMap2.put(key, value);
        }

        sortedMap2.entrySet().forEach(System.out::println);

    }
}
