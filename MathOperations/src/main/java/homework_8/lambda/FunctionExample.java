package homework_8.lambda;

//4. Лямбда-выражение с Function
//Задача: Создайте лямбду, которая принимает строку и возвращает её длину.


import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<String, Integer> lengthOfString = str -> str.length();

        System.out.println(lengthOfString.apply("Hello"));
    }
}
