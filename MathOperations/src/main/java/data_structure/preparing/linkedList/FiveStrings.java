package data_structure.preparing.linkedList;

import java.util.Collections;
import java.util.LinkedList;

//Создайте LinkedList и добавьте в него 5 строк. Выведите все элементы списка.

public class FiveStrings {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        Collections.addAll(linkedList, "Mark", "Peter", "Max", "Abdulkerim", "Erik");
        System.out.println(linkedList);
    }
}
