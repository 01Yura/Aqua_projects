package data_structure.preparing.linkedList;

import java.util.LinkedList;

//Создайте LinkedList содержащий несколько строк. Напишите программу, которая удаляет первый и последний элементы списка, а затем выводит обновленный список.

public class RemoveFirstAndLast {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Cook the hot dish");
        linkedList.add("Cook the salad");
        linkedList.add("Cook the beverage");

        System.out.println(linkedList);

        linkedList.pollFirst();
        linkedList.pollLast();
        System.out.println(linkedList);
    }


}
