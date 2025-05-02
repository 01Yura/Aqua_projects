package tests.leapyear;

/*
5. Проверка, является ли год високосным
Напишите тесты для метода, который определяет, является ли год високосным:

public boolean isLeapYear(int year) {
    return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
}

Тесты должны проверять:
Обычные годы
Високосные (2020, 2000, 1600)
Года, которые делятся на 100, но не на 400 (1900, 2100)
*/


public class LeapYear {

    public boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

}
