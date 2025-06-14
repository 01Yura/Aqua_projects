package no_bugs.data_structure.preparing.hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DeleteAllYanger18 {

    public static <K, V extends Number> void deleteAllLower18(HashMap<K, V> map) {
        Iterator<Map.Entry<K, V>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<K, V> entry = iterator.next();
            if (entry.getValue().intValue() < 18) { // Удаляем, если значение < 18
                iterator.remove();
            }
        }
    }

    public static void deleter(HashMap<String, Integer> hashMap) {
        hashMap.entrySet().removeIf(entry -> entry.getValue() < 18);
    }


    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Yura", 39);
        hashMap.put("Masha", 15);
        hashMap.put("Sveta", 17);
        hashMap.put("Petya", 18);
        hashMap.put("Max", 27);

        System.out.println(hashMap);
        deleteAllLower18(hashMap);
        System.out.println(hashMap);

        hashMap.put("Goga", 5);

        System.out.println(hashMap);
        deleter(hashMap);
        System.out.println(hashMap);

        hashMap.put("Vora", 7);
        System.out.println(hashMap);

        HashMap<String, Integer> copy = new HashMap<>(hashMap);
        System.out.println(copy);

        for (Map.Entry<String, Integer> entry : copy.entrySet()) {
            if (entry.getValue() < 18) {
                hashMap.remove(entry.getKey());
            }
        }
        System.out.println(hashMap);

    }
}
