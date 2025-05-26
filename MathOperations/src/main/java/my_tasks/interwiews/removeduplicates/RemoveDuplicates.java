package my_tasks.interwiews.removeduplicates;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(List.of(1, 3, 5, 7, 5, 1));
        System.out.println(removeDuplicates(list));

    }

    public static <T> List<T> removeDuplicates(List<T> list) {
        Set<T> set = new HashSet<>(list);
        list = new ArrayList<>(set);
        return list;
    }
}
