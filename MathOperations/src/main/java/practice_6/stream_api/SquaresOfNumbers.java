package practice_6.stream_api;

//4. Создание списка квадратов чисел

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SquaresOfNumbers {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(list);

        list = list.stream().map(number -> number * number).toList();
        System.out.println(list);
    }
}
