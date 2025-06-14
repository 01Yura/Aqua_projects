package no_bugs.practice_5.generics.task7;

//Коллекция с обобщёнными типами
//Задача: Создайте Map<K, V> и реализуйте метод, который принимает обобщённые ключи и значения, а затем выводит их.

import java.util.HashMap;
import java.util.Map;

public class CollectionWithCommonTypes {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap1 = new HashMap<>();
        hashMap1.put(1, "Yura");
        hashMap1.put(2, "Kolya");
        hashMap1.put(3, "Boris");

        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("Sergeev", "Sergei");
        hashMap2.put("Borisov", "Boris");
        hashMap2.put("Matveev", "Matvei");

        printMap(hashMap1);
        System.out.println();
        printMap(hashMap2);
    }

    public static <K, V> void printMap(Map<K, V> map) {
        map.entrySet().forEach(System.out::println);
    }

}

class NewCollection {
}
