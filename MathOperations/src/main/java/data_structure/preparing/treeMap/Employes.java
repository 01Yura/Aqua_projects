package data_structure.preparing.treeMap;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

//Реализуйте TreeMap, который хранит сотрудников и их ID, с возможностью поиска ближайшего большего ID.

public class Employes {
    public static <K, V> void findBiggerId(Map<K, V> map, Integer id) {
        Iterator<Map.Entry<K, V>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<K, V> entry = iterator.next();


            if (entry.getKey().equals(id)) {
                System.out.println("Следующий ID: " + iterator.next().getKey());
                break;
            }

        }
    }


    public static void main(String[] args) {
        TreeMap<Integer, String> employes = new TreeMap<>();
        employes.put(4, "Yura");
        employes.put(2, "Max");
        employes.put(1, "Sveta");
        employes.put(3, "Artem");
        employes.put(5, "Kolya");

        System.out.println(employes);

        findBiggerId(employes, 4);
        System.out.println();

    }
}

