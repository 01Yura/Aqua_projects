public class Conversion {
//    Напишите метод convertSecondsToMinutes(int seconds), который возвращает значение в формате:
//    минуты=секунды/60.
//    Вызовите метод в main и выведите результат.

    static double convertSecondsToMinutes(int seconds) {
        double mins = seconds / 60.0;
        return mins;
    }

    public static void main(String[] args) {
        System.out.println(convertSecondsToMinutes(3500));
    }


}
