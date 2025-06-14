package no_bugs.practice_6.stream_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindAverage {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));

        double average = list.stream().collect(Collectors.averagingInt(element -> element));
        System.out.println(average);
    }
}
