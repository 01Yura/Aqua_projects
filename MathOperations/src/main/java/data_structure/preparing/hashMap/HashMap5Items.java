package data_structure.preparing.hashMap;

import java.util.HashMap;
import java.util.Map;

//Создайте HashMap<String, Integer>, добавьте 5 пар (имя – возраст) и выведите все записи.

public class HashMap5Items {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Yura", 39);
        hashMap.put("Masha", 15);
        hashMap.put("Sveta", 55);
        hashMap.put("Petya", 18);
        hashMap.put("Max", 27);

        System.out.println(hashMap);
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry);

            System.out.println();

            hashMap.forEach((key, value) -> System.out.println(key + " " + value));
        }
    }
}
