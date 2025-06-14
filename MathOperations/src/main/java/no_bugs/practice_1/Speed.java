package no_bugs.practice_1;

public class Speed {
//    6. Напишите метод для вычисления средней скорости
//    Создайте метод averageSpeed(double distance, double time), который вычисляет среднюю скорость по формуле:
//    скорость=расстояние/время.
//    Проверьте работу метода с несколькими значениями.

    static double averageSpeed(double distance, double time) {
        double speed = distance / time;
        return speed;
    }

    public static void main(String[] args) {
        System.out.println(averageSpeed(100, 5));

        
    }


}
