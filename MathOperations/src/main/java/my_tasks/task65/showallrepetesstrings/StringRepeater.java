package my_tasks.task65.showallrepetesstrings;

import java.util.HashMap;
import java.util.Map;

public class StringRepeater {
    public static void main(String[] args) {
        String string = "one two one free free one nine";

        String[] array = string.split(" ");
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (String s : array) {
            hashMap.putIfAbsent(s, 0);
            hashMap.put(s, hashMap.get(s) + 1);
        }

        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }


    }
}
