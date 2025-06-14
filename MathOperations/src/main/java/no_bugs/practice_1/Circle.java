package no_bugs.practice_1;

public class Circle {
//    Создайте метод circleCircumference(double radius), который возвращает длину окружности (2πr).
//    Используйте значение π из Math.PI.
//    Проверьте метод на нескольких радиусах.

    static double circleCircumference(double radius) {
        double circumference = 2 * Math.PI * radius;
        return circumference;
    }

    public static void main(String[] args) {
        System.out.println(circleCircumference(5));
    }


}
