package my_tasks;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {

//        Создаем массив
        Integer[] array = {1, 2, 3, 4, 5};

//        Неизменяемый list1
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(list1);

//        Неизменяемый list2
        List<Integer> list2 = Arrays.asList(array);
        System.out.println(list2);

//        Изменяемый list3
        List<Integer> list3 = new LinkedList<>(Arrays.asList(array));
        System.out.println(list3);

//        Изменяемый list4
        List<Integer> list4 = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(list4);

//        Пробуем изменить изменяемый list4, добавив элемент (все работает)
        list4.add(6);
        System.out.println(list4);

//        Пробуем изменить НЕИЗМЕНЯЕМЫЙ list1, добавив элемент (не работает, выдает UnsupportedOperationException)
//        list1.add(6);
//        System.out.println(list1);
    }
}
