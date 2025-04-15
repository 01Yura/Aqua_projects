package practice_6.stream_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AtLeastOneElement {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9, 2, 4, 6, 8, 0));
        System.out.println(list);

        boolean isExist = list.stream().anyMatch(el -> el % 2 == 0);
        System.out.println(isExist);

    }
}
