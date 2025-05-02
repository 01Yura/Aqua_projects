package my_tasks.task30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("Yura", "Boris", "Sergey", "Alexandr", "Ali", "Kris"));
        Stream<String> streamList = list.stream().peek(System.out::println)
                .map(s -> s.toUpperCase()).peek(System.out::println)
                .filter(s -> s.length() > 5).peek(System.out::println);

        System.out.println("Stream is created but not run");
        streamList.forEach(System.out::println);


        System.out.println();


        List<String> list2 = list.stream().filter(s -> s.length() > 4)
                .sorted(Comparator.naturalOrder())
                .peek(System.out::println)
                .collect(Collectors.toList());

        list2.forEach(System.out::println);

        System.out.println();

        List<Integer> listOfIntegers = new ArrayList<>(Arrays.asList(5, 3, 8, 2, 4, 9, 1, 0, 10));
        listOfIntegers = listOfIntegers.stream().filter(n -> {
            System.out.println(n);
            return n > 3 && n < 9;
        }).collect(Collectors.toList());

        listOfIntegers.forEach(System.out::println);


    }
}
