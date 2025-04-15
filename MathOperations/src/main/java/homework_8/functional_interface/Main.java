package homework_8.functional_interface;

public class Main {
    public static void main(String[] args) {

        MathOperations addition = (x, y) -> x + y;
        MathOperations subtraction = (x, y) -> x - y;
        MathOperations multiplying = (x, y) -> x * y;
        MathOperations division = (x, y) -> x / y;

        System.out.println(addition.calculate(10, 2));
        System.out.println(subtraction.calculate(10, 2));
        System.out.println(multiplying.calculate(10, 2));
        System.out.println(division.calculate(10, 2));


    }
}
