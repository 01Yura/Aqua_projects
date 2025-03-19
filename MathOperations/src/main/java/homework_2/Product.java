package homework_2;

public class Product {

//    9. Напишите класс Product
//    Поля:
//    String name (название товара),
//    double price (цена).
//    Реализуйте:
//    Конструктор для задания имени и цены.
//    Геттеры для получения данных.
//    Сеттер для изменения цены.
//    Метод applyDiscount(double discount) для уменьшения цены на discount процентов.
//    Метод printInfo() для вывода:
//            "Товар: Хлеб, Цена: 50.0 руб.".
//    В методе main измените цену через сеттер, примените скидку и выведите новую цену.

    String name;
    double price;


    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public static void main(String[] args) {

        Product myProduct = new Product("Bread", 50);

        myProduct.setPrice(100);
        myProduct.applyDiscount(10);

        System.out.println(myProduct.getPrice());


    }

    String getName() {
        return this.name;
    }

    double getPrice() {
        return this.price;
    }

    void setPrice(double price) {
        this.price = price;
    }

    void applyDiscount(double discount) {
        this.price = this.price - ((this.price / 100) * discount);
    }

    void printInfo() {
        System.out.println("Item: " + this.name + ", Price: " + this.price);
    }


}
