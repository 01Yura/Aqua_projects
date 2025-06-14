package no_bugs.homework_8.lambda;

//5. Использование Consumer
//Задача: Напишите лямбду, которая принимает строку и печатает её в консоль.

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> printer = str -> System.out.println(str);

        printer.accept("Hello");
    }
}
