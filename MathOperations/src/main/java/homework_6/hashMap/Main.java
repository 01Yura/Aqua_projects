package homework_6.hashMap;

import java.util.HashMap;

public class Main {

    public static void deleter(HashMap<String, Integer> map) {
        map.entrySet().removeIf(entry -> entry.getValue() < 18);
    }


    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();

        hashMap.put("Yura", 39);
        hashMap.put("Max", 25);
        hashMap.put("Sveta", 17);
        hashMap.put("Kolya", 3);
        hashMap.put("Vasya", 99);

        System.out.println(hashMap);
        System.out.println();
        hashMap.entrySet().forEach(System.out::println);
        System.out.println();

        System.out.println(hashMap.containsKey("Yura"));
        System.out.println(hashMap.containsKey("Tolya"));
        System.out.println();

        deleter(hashMap);
        System.out.println(hashMap);

    }
}

