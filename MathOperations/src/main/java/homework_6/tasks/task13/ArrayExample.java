package homework_6.tasks.task13;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(array));
        System.out.println();

        array[0] = 100;
        array[4] = 500;

        System.out.println(Arrays.toString(array));
        System.out.println();

        System.out.println(array[1]);


    }


}
