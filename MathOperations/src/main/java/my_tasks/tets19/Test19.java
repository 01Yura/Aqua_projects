package my_tasks.tets19;

import my_tasks.MyException;

import java.util.Arrays;

public class Test19 {
    public static <T extends Number> T findMax(T[] array) {
        if (array.length == 0) {
            throw new MyException("Array is empty");
        }
        T max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (Double.compare(array[i].doubleValue(), max.doubleValue()) > 0) {
                max = array[i];
            }

        }
        return max;
    }

    public static void main(String[] args) {
        int[] array = {1, 5, 8, 43, 2, 67, 90, 8, 34, 43, 74};
        Integer[] array2 = {};

        System.out.println(findMax(array2));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        int max = Arrays.stream(array).max().getAsInt();
        System.out.println(max);

        long timeStart = System.nanoTime();
        long timeEnd = System.nanoTime();
        System.out.println(timeStart);
        System.out.println(timeEnd);

    }
}
