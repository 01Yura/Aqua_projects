package practice_4;

import java.util.Scanner;

public class SwitchTaskSolver {
    public static void main(String[] args) {
//        checkDayOfWeek();
//        describePlanet();
        calculate();
//        describePlanet();
    }


    private static void checkDayOfWeek() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        switch (number) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }
    }

//        Используя enum, создайте перечисление для планет Солнечной системы (Planet) с восемью значениями: MERCURY, VENUS, EARTH, MARS, JUPITER, SATURN, URANUS, NEPTUNE.
//
//                Напишите программу, которая:
//        Принимает с консоли название планеты (значение из перечисления).
//
//        Выводит порядковый номер планеты от Солнца и примерное значение её массы относительно Земли.
//
//        Пример вывода:
//        Введите планету: EARTH
//        Порядковый номер: 3
//        Масса относительно Земли: 1.0

    public static void describePlanet() {
        Scanner scanner = new Scanner(System.in);
        Planet planet = Planet.valueOf(scanner.nextLine());
        scanner.close();

        switch (planet) {
            case MERCURY -> Planet.MERCURY.printInfo();
            case VENUS -> Planet.VENUS.printInfo();
            case EARTH -> Planet.EARTH.printInfo();
            case JUPITER -> Planet.JUPITER.printInfo();
            case SATURN -> Planet.SATURN.printInfo();
            case URANUS -> Planet.URANUS.printInfo();
            case NEPTUNE -> Planet.NEPTUNE.printInfo();
        }
    }


    static void calculate() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int x = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int y = scanner.nextInt();
        System.out.print("Enter the sign from this list (+, -, *, /): ");
        String character = scanner.nextLine();


        switch (character) {
            case "+" -> System.out.println(x + y);
            case "-" -> System.out.println(x - y);
            case "*" -> System.out.println(x * y);
            case "/" -> System.out.println(x / y);
        }
    }

}




