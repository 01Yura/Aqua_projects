package my_tasks.task55.themosrfrequintword;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        String s = "Dog cat dog DOG cat bird";
        System.out.println(findMostFrequentWord(s));
    }

    public static String findMostFrequentWord(String input) {
        String[] array = input.split(" ");
        Map<String, Integer> map = new HashMap<>();

        for (String string : array) {
            String key = string.toLowerCase();
            if (!map.containsKey(key)) {
                map.put(key, 1);
            } else {
                map.replace(key, map.get(key) + 1);
            }
        }

        System.out.println(map.entrySet());

        String word = null;
        int max = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                word = entry.getKey();
            }
        }

//        String word = map.entrySet().stream()
//                .max(Comparator.comparing(Map.Entry::getValue))
//                .map(Map.Entry::getKey)
//                .orElse(null);

//        TreeMap<Integer, String> treeMap = new TreeMap<>();
//        for (Map.Entry<String, Integer> entry : map.entrySet()) {
//            treeMap.put(entry.getValue(), entry.getKey());
//        }

        return word;

    }
}
