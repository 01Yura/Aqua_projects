package no_bugs.homework_7.exceptions.task2;

public class Division {

    public static int divide(int x, int y) {
        int result = 0;
        try {
            result = x / y;
            return result;
        } catch (ArithmeticException e) {
            System.err.println("It is forbidden to divide by 0!");
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(divide(10, 5));
    }
}
