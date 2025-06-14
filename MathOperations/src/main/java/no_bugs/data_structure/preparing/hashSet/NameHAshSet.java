package no_bugs.data_structure.preparing.hashSet;

//Создайте HashSet, содержащий набор имен. Напишите программу, которая проверяет, содержится ли ваше имя в множестве, и выводит соответствующее сообщение.

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class NameHAshSet {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        Collections.addAll(hashSet, "Maria", "Fedor", "Max", "Yura", "Erik");
        System.out.println(hashSet);

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println(name);

        String result = "Ваше имя отсутствует в базе данных";
        for (String element : hashSet) {
            if (element.equals(name)) {
                result = "Ваше имя: " + name + " присутствует в базе данных";
                break;
            }
        }
        System.out.println(result);
    }
}
