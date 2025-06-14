package no_bugs.practice_1;

public class MathOperations2 {
//    Создайте метод findMax(int a, int b), который возвращает большее из двух чисел.
//    В качестве подсказки используйте метод Math.max(a, b) (вам нужно либо присвоить результат метода в переменную, либо сразу вернуть значение return Math.max(a, b)).
//    Вызовите метод из main и выведите результат.

    static int findMax(int a, int b) {
        return Math.max(a, b);
    }

    public static void main(String[] args) {
        System.out.println(findMax(5, 155));
    }
}
