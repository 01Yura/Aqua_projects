package my_tasks;

import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {
        int[] x = new int[20];

        String string = Arrays.toString(x);
        System.out.println(string);

        Arrays.fill(x, 12);
        string = Arrays.toString(x);
        System.out.println(string);

        Arrays.fill(x, 3, 7, 55);
        string = Arrays.toString(x);
        System.out.println(string);

        int[] array = {1, 2, 3, 7, 8, 9, 4, 5, 6, 34, 67, 12, 98, 54, 0};
        Arrays.sort(array);
        Integer sd = 1111;
        System.out.println(sd.toString());
    }

}
