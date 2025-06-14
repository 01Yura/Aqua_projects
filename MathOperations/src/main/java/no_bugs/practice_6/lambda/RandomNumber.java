package no_bugs.practice_6.lambda;

import java.util.function.Supplier;

public class RandomNumber {
    public static void main(String[] args) {
        int max = 100;
        int min = 10;
        Supplier<Integer> randomNumber = () -> {
            return (int) (Math.random() * (max - min + 1) + min);
        };
        System.out.println(randomNumber.get());
    }
}
