package no_bugs.practice_6.stream_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByParity {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15));
        Map<Boolean, List<Integer>> map = list.stream().collect(Collectors.groupingBy(num -> num % 2 == 0));

        map.entrySet().forEach(System.out::println);
    }
}
