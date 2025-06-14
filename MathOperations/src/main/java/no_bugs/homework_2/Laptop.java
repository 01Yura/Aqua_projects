package no_bugs.homework_2;

public class Laptop {

//    10. Реализуйте класс Laptop
//    Поля:
//    String brand (бренд),
//    double price (цена).
//    Реализуйте:
//    Конструктор для задания бренда и цены.
//    Геттеры и сеттеры для обоих полей.
//    Метод printInfo() для вывода:
//            "Ноутбук: Lenovo, Цена: 70000.0 руб.".
//    В методе main измените цену через сеттер и выведите обновлённую информацию.

    String brand;
    double price;

    Laptop(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public static void main(String[] args) {

        Laptop myLaptop = new Laptop("Lenovo", 70000);

        myLaptop.setPrice(100000);
        myLaptop.printInfo();

    }

    String getBrand() {
        return this.brand;
    }

    void setBrand(String brand) {
        this.brand = brand;
    }

    double getPrice() {
        return this.price;
    }

    void setPrice(double price) {
        this.price = price;
    }

    void printInfo() {
        System.out.println("Laptop: " + this.brand + ", Price: " + this.price);
    }


}
