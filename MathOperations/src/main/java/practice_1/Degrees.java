public class Degrees {
//    10. Создайте методы для перевода градусов Цельсия в Фаренгейты и обратно
//    Реализуйте два метода:
//    celsiusToFahrenheit(double celsius) — переводит температуру из градусов Цельсия в Фаренгейты (F=C×9/5+32F).
//    fahrenheitToCelsius(double fahrenheit) — переводит температуру из Фаренгейтов в Цельсии (C=(F−32)×5/9C ).
//    Проверьте методы на нескольких значениях.

    static double celsiusToFahrenheit(double celsius) {
        double f = celsius * 9 / 5 + 32;
        return f;
    }

    static double fahrenheitToCelsius(double fahrenheit) {
        double c = (fahrenheit - 32) * 5 / 9;
        return c;
    }

    public static void main(String[] args) {
        System.out.println(celsiusToFahrenheit(25));
        System.out.println(fahrenheitToCelsius(100));
    }


}
