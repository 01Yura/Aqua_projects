public class MathOperations {
//    Создайте методы:
//    add(int x, int y) — возвращает сумму двух чисел.
//    subtract(int x, int y) — возвращает разность двух чисел.
//    multiply(int x, int y) — возвращает произведение двух чисел.
//    divide(int x, int y) — возвращает результат деления (тип double).
//    В методе main вызовите каждый метод с любыми значениями и выведите результаты.

    static int add(int x, int y) {
        return x + y;
    }

    static int subtract(int x, int y) {
        return x - y;
    }

    static int multiply(int x, int y) {
        return x * y;
    }

    static double divide(double x, double y) {
        return x / y;
    }

    public static void main(String[] args) {
        System.out.println(add(10, 3));
        System.out.println(subtract(10, 3));
        System.out.println(multiply(10, 3));
        System.out.println(divide(10, 3));
    }


}
