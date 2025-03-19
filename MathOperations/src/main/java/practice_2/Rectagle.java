package practice_2;

public class Rectagle {
//    2. Напишите класс Rectangle
//    Поля:
//
//    int width (ширина),
//    int height (высота).
//
//    Реализуйте:
//
//    Конструктор для задания ширины и высоты.
//    Геттеры для получения значений ширины и высоты.
//    Сеттер для изменения ширины.
//    Метод calculateArea(), который возвращает площадь прямоугольника.
//    В методе main создайте прямоугольник, измените ширину через сеттер и выведите его площадь.

    int width;
    int height;

    Rectagle(int width, int height) {
        this.width = width;
        this.height = height;

    }

    public static void main(String[] args) {
        Rectagle myRectangle = new Rectagle(5, 6);

        myRectangle.setWidth(10);
        System.out.println(myRectangle.calculateArea());


    }

    int getWidth() {
        return width;
    }

    void setWidth(int width) {
        this.width = width;
    }

    int getHeight() {
        return height;
    }

    int calculateArea() {
        int area = this.width * this.height;
        return area;
    }


}
