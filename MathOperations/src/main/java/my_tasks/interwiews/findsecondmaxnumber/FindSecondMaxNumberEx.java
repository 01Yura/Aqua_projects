package my_tasks.interwiews.findsecondmaxnumber;

import java.util.Arrays;


public class FindSecondMaxNumberEx {
    public static void main(String[] args) {
        int[] array1 = {5, 2, 7, 3, 6, 9, 1, 0};
        System.out.println(findSecondMaxNum(array1));
        System.out.println(Arrays.toString(array1));
    }

    public static int findSecondMaxNum(int[] array) {
        int[] copy = Arrays.copyOf(array, array.length);
        Arrays.sort(copy);
        int second = copy[copy.length - 2];
        return second;
    }
}
