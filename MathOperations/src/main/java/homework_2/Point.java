package homework_2;

public class Point {
    //    5. Напишите класс Point
//    Поля:
//    int x (координата x),
//    int y (координата y).
//    Реализуйте:
//    Конструктор для задания координат.
//    Геттеры для получения значений координат.
//    Сеттер для изменения значения x.
//            Метод print() для вывода координат в формате:
//            "Координаты: x = 5, y = 10".
//    В методе main измените координату x и выведите новые координаты.
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
        Point myPoint = new Point(5, 7);

        myPoint.setX(10);

        myPoint.print();

    }

    int getX() {
        return this.x;
    }

    void setX(int x) {
        this.x = x;
    }

    int getY() {
        return this.y;
    }

    void print() {
        System.out.println("Coordinates: x = " + this.x + ", y = " + this.y);
    }


}
