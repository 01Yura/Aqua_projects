package no_bugs.practice_6.func_int;

/*1. Создайте свой функциональный интерфейс
Задача: Напишите интерфейс MathOperation, который принимает два числа и возвращает результат операции. Реализуйте его с помощью лямбда-выражений:
сложение, вычитание, умножение, деление.*/


public class Main {
    public static void main(String[] args) {

//        Здесь ты создаёшь переменную addition типа MathOperation, и присваиваешь ей лямбду, которая знает, что делать, когда вызовут calculate(x, y).
        
        MathOperation addition = (x, y) -> x + y;
        MathOperation subtraction = (x, y) -> x - y;
        MathOperation multiplication = (x, y) -> x * y;
        MathOperation division = (x, y) -> x / y;

        addition.calculate(10, 2);
        System.out.println(subtraction.calculate(10, 2));
        System.out.println(multiplication.calculate(10, 2));
        System.out.println(division.calculate(10, 2));


    }
}
