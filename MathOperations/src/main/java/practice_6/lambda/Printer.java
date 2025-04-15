package practice_6.lambda;

import java.util.function.Consumer;
/*
5. Использование Consumer
Задача: Напишите лямбду, которая принимает строку и печатает её в консоль.
*/

public class Printer {
    public static void main(String[] args) {
        Consumer<String> printer = s -> System.out.println(s);
        printer.accept("Hello world!");
    }
}
