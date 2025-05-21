package my_tasks.task40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10));
        double average = list.stream().filter(num -> num % 2 == 0).mapToInt(value -> value.intValue()).average().getAsDouble();
        System.out.println(average);

        int sum = list.stream().mapToInt(value -> value.intValue()).sum();
        System.out.println(sum);

        int min = list.stream().mapToInt(value -> value.intValue()).min().orElse(0);
        System.out.println(min);

        int max = list.stream().mapToInt(value -> value.intValue()).max().orElse(0);
        System.out.println(max);
    }
}