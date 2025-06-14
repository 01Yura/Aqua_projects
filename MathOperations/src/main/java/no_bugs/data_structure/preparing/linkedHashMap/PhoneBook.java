package no_bugs.data_structure.preparing.linkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

//Реализуйте телефонную книгу с LinkedHashMap. Добавьте, найдите, удалите контакт.

public class PhoneBook {
    public static <K, V> void addContact(Map<K, V> map, K name, V phoneNumber) {
        map.put(name, phoneNumber);
        System.out.println("Contact " + name + " with number " + phoneNumber + " has been added to the phone book");
        System.out.println(map);
    }

    public static <K, V> void removeContactUsingName(Map<K, V> map, K name) {
        map.remove(name);
        System.out.println("Contact " + name + " has been deleted from the phone book");
        System.out.println(map);
    }

    public static <K, V> void removeContactUsingPhone(Map<K, V> map, K phoneNumber) {

        map.entrySet().removeIf(entry -> entry.getValue().equals(phoneNumber));

        System.out.println("Contact " + phoneNumber + " has been deleted from the phone book");
        System.out.println(map);
    }


    public static void main(String[] args) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("Yura", "89159839618");
        linkedHashMap.put("Masha", "89995834514");
        linkedHashMap.put("Sveta", "89099839616");
        linkedHashMap.put("Petya", "89019839611");
        linkedHashMap.put("Max", "89159834567");
        System.out.println(linkedHashMap);
        System.out.println();

        linkedHashMap.entrySet().forEach(entry -> {
            if (entry.getKey() == "Yura") System.out.println(entry.getValue());
        });

        linkedHashMap.entrySet().forEach(entry -> {
            if (entry.getValue() == "89159839617") System.out.println(entry.getKey());
        });

        addContact(linkedHashMap, "Vasia", "89017771177");

        removeContactUsingName(linkedHashMap, "Vasia");

        removeContactUsingPhone(linkedHashMap, "89159834567");
    }


}
