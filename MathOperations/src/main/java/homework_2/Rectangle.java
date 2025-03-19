package homework_2;

public class Rectangle {
//    2. Напишите класс Rectangle
//    Поля:
//    int width (ширина),
//    int height (высота).
//    Реализуйте:
//    Конструктор для задания ширины и высоты.
//    Геттеры для получения значений ширины и высоты.
//    Сеттер для изменения ширины.
//    Метод calculateArea(), который возвращает площадь прямоугольника.
//    В методе main создайте прямоугольник, измените ширину через сеттер и выведите его площадь.


    int width;
    int height;

    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public static void main(String[] args) {

        Rectangle myRectangle = new Rectangle(10, 6);

        myRectangle.setWidth(11);

        System.out.println(myRectangle.calculateArea());

    }

    int getWidth() {
        return this.width;
    }

    void setWidth(int width) {
        this.width = width;
    }

    int getHeight() {
        return this.height;
    }

    int calculateArea() {
        return this.width * this.height;
    }


}
