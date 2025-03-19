package practice_2;

public class Car {
    //    1. Напишите класс Car
//    Поля:
//
//    String brand (марка машины),
//    int year (год выпуска).
//
//    Реализуйте:
//
//    Конструктор, который принимает brand и year.
//    Геттеры и сеттеры для обоих полей.
//    Метод print(), который выводит информацию о машине в формате:
//            "Марка: Toyota, Год выпуска: 2015".
//    В методе main создайте объект класса Car, установите значения через конструктор, измените год через сеттер и выведите информацию.
    String brand;
    int year;

    Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 2015);
        System.out.println(myCar.getYear());

        myCar.setYear(1995);
        myCar.print();
    }

    String getBrand() {
        return brand;
    }

    void setBrand(String brand) {
        this.brand = brand;
    }

    int getYear() {
        return year;
    }

    void setYear(int year) {
        this.year = year;

    }


    void print() {
        System.out.println("Марка: " + this.brand + ", Год выпуска: " + this.year);
    }
}
