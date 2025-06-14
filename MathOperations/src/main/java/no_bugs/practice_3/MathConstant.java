package no_bugs.practice_3;

public class MathConstant {
    //    2.Создайте класс MathConstants:
//    Поля:
//    final double PI = 3.14159 — значение числа Пи.
//    final double E = 2.71828 — значение числа Эйлера.
//
//            Реализуйте:
//    Статические методы для вычисления:
//    Площади круга (πr ^ 2).
//    Длины окружности (2πr).
//    В main протестируйте методы с разными значениями радиуса.
    static final double PI = 3.14159;
    static final double E = 2.71828;

    static double CalculateArea(double radiaus) {
        double area = MathConstant.PI * Math.pow(radiaus, 2);
        return area;
    }

    static double CalculateCircumference(double radius) {
        double circumference = 2 * MathConstant.PI * radius;
        return circumference;
    }

    public static void main(String[] args) {
        System.out.println(MathConstant.CalculateArea(5.5));
        System.out.println(MathConstant.CalculateCircumference(5.5));
    }
}
