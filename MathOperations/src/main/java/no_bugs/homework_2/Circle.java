package no_bugs.homework_2;

public class Circle {
//7. Напишите класс Circle
//    Поля:
//    double radius (радиус).
//    Реализуйте:
//    Конструктор для задания радиуса.
//    Геттер для получения радиуса.
//    Сеттер для изменения радиуса.
//    Метод calculateArea(), который возвращает площадь (πr2).
//    Метод calculateCircumference(), который возвращает длину окружности (2πr).
//    В методе main создайте круг, измените радиус через сеттер и выведите площадь и длину окружности.


    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public static void main(String[] args) {

        Circle myCircle = new Circle(10);

        myCircle.setRadius(15);
        System.out.println(myCircle.calculateArea());
        System.out.println(myCircle.calculateCircumference());

    }

    double getRadius() {
        return this.radius;
    }

    void setRadius(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        double area = Math.PI * (this.radius * this.radius);
        return area;
    }

    double calculateCircumference() {
        double c = 2 * Math.PI * this.radius;
        return c;
    }


}
