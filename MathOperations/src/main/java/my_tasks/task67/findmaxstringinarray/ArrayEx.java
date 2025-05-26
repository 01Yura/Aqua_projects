package my_tasks.task67.findmaxstringinarray;

import java.util.Arrays;

public class ArrayEx {
    public static void main(String[] args) {
        String s = "Hello my dear friend Bob";
        String[] array = s.split(" ");
        int index = 0;
        int length = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() > length) {
                length = array[i].length();
                index = i;
            }
        }
        System.out.println(index);

        int[][] array2 = {{5, 2, 3}, {6, 7, 1}, {4, 4, 0}};
        int max = Arrays.stream(array2).flatMapToInt(array3 -> Arrays.stream(array3)).max().getAsInt();
        System.out.println(max);

    }
}
