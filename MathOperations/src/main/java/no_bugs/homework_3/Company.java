package no_bugs.homework_3;

//1.Создайте класс Company:
//Поля:
//static String companyName — название компании (общее для всех сотрудников).
//final int employeeID — уникальный идентификатор сотрудника (задан при создании объекта).
//String employeeName — имя сотрудника.
//
//Реализуйте:
//Конструктор для инициализации полей employeeID и employeeName.
//Статический метод printCompanyName(), который выводит название компании.
//Геттеры и сеттеры для employeeName (поля employeeID менять нельзя).
//
//В main создайте несколько сотрудников и проверьте:
//Изменение companyName для всех объектов.
//Ошибку при попытке изменить employeeID.

public class Company {

    static String companyName;
    final int employeeID;
    String employeeName;


    Company(int employeeID, String employeeName) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
    }

    static void printCompanyName() {
        System.out.println(Company.companyName);
    }

    public static void main(String[] args) {

        Company newEmployee1 = new Company(1, "Vasya");
        Company newEmployee2 = new Company(2, "Masha");

        Company.companyName = "Tesla";

        Company.printCompanyName();
    }

    String getEmployeeName() {
        return this.employeeName;
    }

    void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

}
