public class Geometry {
//    Напишите метод findHypotenuse(double a, double b), который вычисляет гипотенузу прямоугольного треугольника по теореме Пифагора:
//    гипотенуза2=a2+b2.
//    Используйте метод Math.sqrt() для вычисления корня.
//    Проверьте работу метода.

    static double findHypotenuse(double a, double b) {
        double hypsquare = a * a + b * b;
        double hyp = Math.sqrt(hypsquare);
        return hyp;
    }

    public static void main(String[] args) {
        System.out.println(findHypotenuse(5, 6));
    }


}
