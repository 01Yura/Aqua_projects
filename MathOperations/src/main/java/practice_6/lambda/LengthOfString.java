package practice_6.lambda;

import java.util.function.Function;
/*
4. Лямбда-выражение с Function
Задача: Создайте лямбду, которая принимает строку и возвращает её длину.
*/

public class LengthOfString {
    public static void main(String[] args) {
        Function<String, Integer> lenghthOfString = s -> s.length();

        System.out.println(lenghthOfString.apply("Hello world!"));
    }
}
