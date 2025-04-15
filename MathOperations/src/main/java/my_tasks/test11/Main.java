package my_tasks.test11;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Checker isPositive = x -> x > 0;
        isPositive.printIfValid(0);

        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(linkedList);
        linkedList.forEach(element -> System.out.println(element));
        linkedList.removeIf(element -> element > 3);
        System.out.println(linkedList);
        System.out.println();

        linkedList.forEach(System.out::println);

        Runnable r1 = new Runnable() {
            @Override
            public void run() {

            }
        };
    }
}
