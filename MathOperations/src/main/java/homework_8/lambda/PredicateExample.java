package homework_8.lambda;

//3. Лямбда-выражение с Predicate
//Задача: Напишите лямбду, которая проверяет, является ли число чётным.

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> isEven = x -> x % 2 == 0;

        System.out.println(isEven.test(10));
        System.out.println(isEven.test(11));
    }
}
