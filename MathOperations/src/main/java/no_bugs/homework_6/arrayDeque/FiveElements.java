package no_bugs.homework_6.arrayDeque;

import java.util.ArrayDeque;

public class FiveElements {
    public static void main(String[] args) {
        ArrayDeque<Integer> numbers = new ArrayDeque<>();

        numbers.add(1);
        numbers.add(12);
        System.out.println(numbers);

        numbers.addFirst(13);
        System.out.println(numbers);

        numbers.offer(155);
        System.out.println(numbers);

        numbers.offerFirst(12121);
        System.out.println(numbers);

        numbers.forEach(System.out::println);
    }
}
