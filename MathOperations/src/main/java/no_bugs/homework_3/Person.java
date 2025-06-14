package no_bugs.homework_3;

//Задача 6: Класс Person
//Поля:
//private String firstName — имя.
//private String lastName — фамилия.
//private final String ssn — номер социального страхования.
//
//        Реализуйте:
//Конструктор для инициализации всех полей.
//Геттеры для всех полей.
//Сеттеры для firstName и lastName (поле ssn менять нельзя).
//Метод printPersonInfo(), который выводит:
//        "Имя: Иван, Фамилия: Иванов, SSN: 123-45-6789".
//
//В методе main:
//Создайте несколько объектов класса Person.
//Измените имя и фамилию одного из них через сеттеры.
//Выведите информацию о каждом человеке.

public class Person {

    private final String ssn;
    private String firstName;
    private String lastName;

    Person(String firstName, String lastName, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
    }

    public static void main(String[] args) {

        Person person1 = new Person("Vasya", "Pupkin", "123-45-6789");
        Person person2 = new Person("Misha", "Vasilyev", "323-35-3789");

        person1.printPersonInfo();
        person2.printPersonInfo();

        person1.setFirstName("Vasilisa");
        person1.setLastName("Pupkina");

        person1.printPersonInfo();
        person2.printPersonInfo();

    }

    String getFirstName() {
        return this.firstName;
    }

    void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    String getLastName() {
        return this.lastName;
    }

    void setLastName(String lastName) {
        this.lastName = lastName;
    }

    String getSsn() {
        return this.ssn;
    }

    void printPersonInfo() {
        System.out.println("Name: " + this.firstName + ", Last name: " + this.lastName + ", SSN: " + this.ssn);
    }


}
