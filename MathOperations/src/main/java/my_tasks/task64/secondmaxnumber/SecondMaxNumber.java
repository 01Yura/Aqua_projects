package my_tasks.task64.secondmaxnumber;

import java.util.Arrays;

public class SecondMaxNumber {
    public static void main(String[] args) {
        int[] array = {22, 1, 45, 12, 8, 32, 98, 3, 76, 21, 65, 26, 48, 60, 14, 65, 32, 97, 12, 75,};
        int[] array2 = {100, 28, 99, 90};
        returnSecondMaxValue(array);
        returnNMaxValue(array, 3);
        returnSecondMaxValue(array2);
        returnNMaxValue(array2, 3);
    }

    public static void returnSecondMaxValue(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > secondMax && array[i] != max) {
                secondMax = array[i];
            }
        }
        System.out.println("secondMax = " + secondMax);
    }

    public static void returnNMaxValue(int[] array, int n) {
        Arrays.sort(array);
        int NMax = array[array.length - n];
        System.out.println(n + "Max = " + NMax);
    }


}
