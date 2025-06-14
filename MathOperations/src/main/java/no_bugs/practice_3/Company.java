package no_bugs.practice_3;

public class Company {
//    1.Создайте класс Company:
//    Поля:
//
//    static String companyName — название компании (общее для всех сотрудников).
//    final int employeeID — уникальный идентификатор сотрудника (задан при создании объекта).
//    String employeeName — имя сотрудника.
//
//
//    Реализуйте:
//
//    Конструктор для инициализации полей employeeID и employeeName.
//    Статический метод printCompanyName(), который выводит название компании.
//    Геттеры и сеттеры для employeeName (поля employeeID менять нельзя).
//
//
//    В main создайте несколько сотрудников и проверьте:
//
//    Изменение companyName для всех объектов.
//    Ошибку при попытке изменить employeeID.

    static String companyName;

    final int employeeID;
    String employeeName;

    Company(int employeeID, String employeeName) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
    }

    static void printCompanyName() {
        System.out.println(companyName);
    }

    public static void main(String[] args) {
        Company newEmployee1 = new Company(1, "Vasya");
        Company newEmployee2 = new Company(2, "Petya");
        Company newEmployee3 = new Company(3, "Fedya");

        System.out.println(newEmployee1.employeeName);
        Company.printCompanyName();
        Company.setCompanyName("Romashka");
        Company.printCompanyName();

    }

    static void setCompanyName(String companyName) {
        Company.companyName = companyName;
    }

    String getEmployeeName() {
        return this.employeeName;
    }

    void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    int getEmployeeID() {
        return this.employeeID;
    }
}
