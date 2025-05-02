package my_tasks.task37;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> unsortedMap = new HashMap<>();
        unsortedMap.put("One", 1);
        unsortedMap.put("Two", 2);
        unsortedMap.put("Three", 3);
        unsortedMap.put("Four", 4);
        unsortedMap.put("Five", 5);

        unsortedMap.entrySet().forEach(System.out::println);
        System.out.println();

        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();

        unsortedMap.entrySet().stream().sorted((o1, o2) -> o1.getValue().compareTo(o2.getValue())).forEach(System.out::println);
    }
}
