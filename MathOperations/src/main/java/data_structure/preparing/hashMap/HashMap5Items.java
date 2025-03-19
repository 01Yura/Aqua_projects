package data_structure.preparing.hashMap;

import java.util.HashMap;

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
    }
}
