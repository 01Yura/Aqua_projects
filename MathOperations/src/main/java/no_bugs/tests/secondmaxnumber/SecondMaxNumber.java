package no_bugs.tests.secondmaxnumber;

import java.util.Arrays;

public class SecondMaxNumber {

    public static void main(String[] args) {
        System.out.println(new SecondMaxNumber().findSecondMax(new int[]{1, 2, 3, 4, 3, 3, 3, 3}));
    }


    public int findSecondMax(int[] numbers) {
        return Arrays.stream(numbers).distinct().sorted().skip(numbers.length - 2).findFirst().orElseThrow();
    }
}
