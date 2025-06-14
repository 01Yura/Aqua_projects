package no_bugs.homework_4;

import java.util.Scanner;

public class SwitchTaskSolver {
    public static void main(String[] args) {
//        checkDayOfWeek();
        printPlanetInfo();
//        calculate();


    }

    public static void checkDayOfWeek() {
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();

        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Error");
        }

    }

    public static void printPlanetInfo() {
        Scanner scanner = new Scanner(System.in);
        Planets planet = Planets.valueOf(scanner.nextLine().toUpperCase());

        switch (planet) {
            case MERCURY -> Planets.MERCURY.displayPlanetInfo();
            case VENUS -> Planets.VENUS.displayPlanetInfo();
            case EARTH -> Planets.EARTH.displayPlanetInfo();
            case MARS -> Planets.MARS.displayPlanetInfo();
            case JUPITER -> Planets.JUPITER.displayPlanetInfo();
            case SATURN -> Planets.SATURN.displayPlanetInfo();
            case URANUS -> Planets.URANUS.displayPlanetInfo();
            case NEPTUNE -> Planets.NEPTUNE.displayPlanetInfo();

        }
    }

    public static void calculate() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int x = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int y = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter the sign: ");
        String sign = scanner.nextLine();

        switch (sign) {
            case "+" -> System.out.println(x + y);
            case "-" -> System.out.println(x - y);
            case "*" -> System.out.println(x * y);
            case "/" -> System.out.println(x / y);


        }

    }


}
