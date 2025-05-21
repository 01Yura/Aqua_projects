package my_tasks.task53;

import java.util.ArrayList;
import java.util.Arrays;

public class ScopeExample {
    String name = "Yura";
    int[] array = {1, 2, 3};
    ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 20));


    public static void main(String[] args) {
        ScopeExample example = new ScopeExample();

        example.name = "Petya";
        example.array[0] = 1000;
        example.list.add(30);


        System.out.println(example.name);
        System.out.println(Arrays.toString(example.array));
        System.out.println(example.list);
    }
}
