package my_tasks.test20;

import java.util.Arrays;

public class Test20 {
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(array1));

        int[] array2 = new int[4];
        array2[0] = 1;
        array2[1] = 2;
        array2[2] = 3;
        array2[3] = 4;
        for (int i = array2.length - 1; i >= 0; i--) {
            System.out.println(array2[i]);
        }

        int[] array3 = new int[1_000_000];
        for (int i = 0; i < array3.length; i++) {
            array3[i] = i;
        }


    }
}
