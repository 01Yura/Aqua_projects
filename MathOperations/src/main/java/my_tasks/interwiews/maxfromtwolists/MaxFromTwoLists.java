package my_tasks.interwiews.maxfromtwolists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxFromTwoLists {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9, 2));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(2, 3, 10, 7, 5, 10));
        System.out.println(findMaxValue(list1, list2));
    }

    public static int findMaxValue(List<Integer> list1, List<Integer> list2) {
        list1.addAll(list2);
        System.out.println(list1);
//        return Collections.max(list1);
        return list1.stream().max(Integer::compareTo).get();

    }
}
