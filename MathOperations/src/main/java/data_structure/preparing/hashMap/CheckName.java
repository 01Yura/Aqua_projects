package data_structure.preparing.hashMap;

import java.util.HashMap;

public class CheckName {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Yura", 39);
        hashMap.put("Masha", 15);
        hashMap.put("Sveta", 17);
        hashMap.put("Petya", 18);
        hashMap.put("Max", 27);

        System.out.println(hashMap);

        System.out.println(hashMap.containsKey("Yura"));


    }
}
