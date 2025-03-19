package data_structure.preparing.linkedList;

import java.util.LinkedList;

//Реализуйте очередь задач с LinkedList. Добавьте 3 задачи и обработайте их в порядке поступления.

public class QueueOfTasks {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.offer("Cook the hot dish");
        linkedList.offer("Cook the salad");
        linkedList.offer("Cook the beverage");

        System.out.println(linkedList);

        linkedList.poll();
        System.out.println(linkedList);
        linkedList.poll();
        System.out.println(linkedList);
        linkedList.poll();
        System.out.println(linkedList);
    }


}
