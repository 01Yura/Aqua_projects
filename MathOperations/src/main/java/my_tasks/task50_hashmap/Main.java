package my_tasks.task50_hashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 2);
        map.put("b", 4);
        map.put("c", 3);
        map.put("d", 1);
        map.put("e", 5);
        map.put("f", 6);

        map.forEach((s, integer) -> System.out.println(s + " " + integer));

        LinkedHashMap<String, Integer> hashMap = new LinkedHashMap<>();

    }
}
