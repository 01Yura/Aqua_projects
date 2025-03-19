package homework_6.arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class MaxAndMin {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 34, 67, 12, 90, 23, 1, 6, 9, 23, 6, 78);

        System.out.println(Collections.max(numbers));
        System.out.println(Collections.min(numbers));
    }
}
