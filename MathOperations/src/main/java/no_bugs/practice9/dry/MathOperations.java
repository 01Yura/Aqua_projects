package no_bugs.practice9.dry;

//1. Нарушение DRY (Don't Repeat Yourself) – дублирование кода
// Задача: Устраните дублирование кода, применив перегрузку методов или использование массива аргументов.
//        Исходный код:

public class MathOperations {
    public int add(int a, int b) {
        return a + b;
    }

    public int addThreeNumbers(int a, int b, int c) {
        return a + b + c;
    }

    public int addFourNumbers(int a, int b, int c, int d) {
        return a + b + c + d;
    }
}

// Fixed code, using varArgs
class MathOperationsFixed {
    public int add(int... args) {
        int sum = 0;
        for (int element : args) {
            sum += element;
        }
        return sum;
    }
}

class Main {
    public static void main(String[] args) {
        MathOperationsFixed mathOperationsFixed = new MathOperationsFixed();
        System.out.println(mathOperationsFixed.add(1, 2, 3, 4, 5));
        System.out.println(mathOperationsFixed.add(1, 2));

    }
}


