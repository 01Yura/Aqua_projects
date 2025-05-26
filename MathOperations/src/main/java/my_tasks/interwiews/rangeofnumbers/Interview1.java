package my_tasks.interwiews.rangeofnumbers;

import java.util.ArrayList;
import java.util.List;

public class Interview1 {

    public static void main(String[] args) {
        method(10, 30);
    }

    public static void method(int min, int max) {
        if (min > max) {
            throw new IllegalArgumentException();
        }
        List<Integer> list = new ArrayList<>();
        int number = min;
        while (number <= max) {
            list.add(number);
            number++;
        }

        for (Integer i : list) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " fizzbuzz");
            } else {

                if (i % 3 == 0) {
                    System.out.println(i + " fizz");
                } else if (i % 5 == 0) {
                    System.out.println(i + " buzz");
                } else {
                    System.out.println(i);
                }
            }
        }

    }
}
