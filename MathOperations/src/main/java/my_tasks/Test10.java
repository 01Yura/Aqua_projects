package my_tasks;

public class Test10 {
    public static void main(String[] args) {
//        Создаём объект анонимного класса, реализующего интерфейс MathOperations, и переопределяем метод calculate
        MathOperations m1 = new MathOperations() {
            @Override
            public int calculate(int a, int b) {
                return a + b;
            }
        };
//        Создаем ещё один объект анонимного класса, реализующего интерфейс MathOperations с другой реализацией calculate
        MathOperations m2 = new MathOperations() {
            @Override
            public int calculate(int a, int b) {
                return a * b;
            }
        };

        System.out.println(m1.calculate(2, 7));
        System.out.println(m2.calculate(3, 4));
//        Создаём объект обычного класса Mathematica, который реализует интерфейс MathOperations. Метод calculate в нем переопределен.
        Mathematica m3 = new Mathematica();
        System.out.println(m3.calculate(10, 3));
//        Создаем объект на основе абстрактного интерфейса MathOperations и сразу прописываем логику, используя лямбда выражение
        MathOperations m4 = (a, b) -> a * b;
        System.out.println(m4.calculate(10, 7));

    }
}

class Mathematica implements MathOperations {
    @Override
    public int calculate(int a, int b) {
        return a - b;
    }
}
