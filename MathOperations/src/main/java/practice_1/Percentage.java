public class Percentage {
//    9. Реализуйте метод для вычисления процентов
//    Напишите метод calculatePercentage(double total, double part), который возвращает, какой процент от общего составляет часть.
//    Формула: процент=(часть/общее)×100.
//    Вызовите метод в main.

    static double calculatePercentage(double total, double part) {
        double percentage = (part / total) * 100;
        return percentage;
    }

    public static void main(String[] args) {
        System.out.println(calculatePercentage(100, 20));
    }


}
