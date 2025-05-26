package my_tasks.interwiews.findmaxnumber;

import java.util.Arrays;

public class FindMaxNumberEx {
    public static void main(String[] args) {
        System.out.println("findMaxNumber(new int[]{1, 3, 5, 9, 4, 6}) = " + findMaxNumber(new int[]{1, 3, 5, 9, 4, 6}));

    }

    public static int findMaxNumber(int... array) {
        return Arrays.stream(array).max().getAsInt();
    }
}
