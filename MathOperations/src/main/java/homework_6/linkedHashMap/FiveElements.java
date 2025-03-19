package homework_6.linkedHashMap;

import java.util.LinkedHashMap;

public class FiveElements {
    public static void main(String[] args) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put("Yura", "18");
        linkedHashMap.put("Max", "123");
        linkedHashMap.put("Sveta", "999");
        linkedHashMap.put("Kolya", "2");
        linkedHashMap.put("Petya", "55");

        linkedHashMap.entrySet().forEach(System.out::println);
    }
}
