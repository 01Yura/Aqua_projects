package my_tasks.interwiews.sumofnumbersinarray;

import java.util.Arrays;

public class SumOfNumbersEx {
    public static void main(String[] args) {
        System.out.println("sum array {1,2,3,4,5}) = " + sum(new int[]{1, 2, 3, 4, 5}));
        System.out.println("sum(1,2,3,4,5,6) = " + sum(1, 2, 3, 4, 5, 6));
    }

    public static int sum(int... args) {
        return Arrays.stream(args).sum();
    }
}
