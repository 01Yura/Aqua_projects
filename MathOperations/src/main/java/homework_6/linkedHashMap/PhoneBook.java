package homework_6.linkedHashMap;

import java.util.LinkedHashMap;

public class PhoneBook {
    public static void main(String[] args) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put("Yura", "18");
        linkedHashMap.put("Max", "123");
        linkedHashMap.put("Sveta", "999");
        linkedHashMap.put("Kolya", "2");
        linkedHashMap.put("Petya", "55");

        linkedHashMap.entrySet().forEach(System.out::println);
        System.out.println();
        linkedHashMap.put("Slava", "666");
        linkedHashMap.entrySet().forEach(System.out::println);

        System.out.println();
        linkedHashMap.entrySet().removeIf(entry -> entry.getValue().equals("666"));
        linkedHashMap.entrySet().forEach(System.out::println);
        System.out.println();

        linkedHashMap.remove("Yura");
        linkedHashMap.entrySet().forEach(System.out::println);
        System.out.println();

        System.out.println(linkedHashMap.get("Max"));
        System.out.println();

        linkedHashMap.entrySet().forEach(entry -> {
            if (entry.getValue().equals("123")) System.out.println(entry.getKey());
        });

    }
}
