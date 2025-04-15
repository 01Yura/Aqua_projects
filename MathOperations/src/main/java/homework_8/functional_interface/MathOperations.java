package homework_8.functional_interface;

//1. Создайте свой функциональный интерфейс
//Задача: Напишите интерфейс MathOperation, который принимает два числа и возвращает результат операции. Реализуйте его с помощью лямбда-выражений: сложение, вычитание, умножение, деление.

@FunctionalInterface
public interface MathOperations {
    int calculate(int x, int y);
}
