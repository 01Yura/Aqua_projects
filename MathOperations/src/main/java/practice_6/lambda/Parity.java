package practice_6.lambda;

import java.util.function.Predicate;

/*3. Лямбда-выражение с Predicate
Задача: Напишите лямбду, которая проверяет, является ли число чётным.*/

public class Parity {
    public static void main(String[] args) {
        Predicate<Integer> isEven = x -> x % 2 == 0;
        System.out.println(isEven.test(10));
        System.out.println(isEven.test(3));

    }
}
