package homework_3;

//2.Создайте класс MathConstants:
//Поля:
//final double PI = 3.14159 — значение числа Пи.
//final double E = 2.71828 — значение числа Эйлера.
//
//        Реализуйте:
//Статические методы для вычисления:
//Площади круга (πr ^ 2).
//Длины окружности (2πr).
//В main протестируйте методы с разными значениями радиуса.


public class MathConstants {

    static final double E = 2.71828;
    static double PI = 3.14159;

    static double calculateCircleArea(double radius) {
        double area = MathConstants.PI * (radius * radius);
        return area;
    }

    static double calculateCircumference(double radius) {
        double c = 2 * PI * radius;
        return c;
    }

    public static void main(String[] args) {
        System.out.println(MathConstants.calculateCircleArea(5));
        System.out.println(calculateCircumference(5));
    }

}
