package no_bugs.tests.commonpackage;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CommonClass1 {

    public List<String> sortByLength(List<String> words) {
        return words.stream()
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());
    }


    public List<Integer> filterEvenNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
    }
}
