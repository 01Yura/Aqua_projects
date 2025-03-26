package practice5.exceptions.task2;

public class DevideTwoNumbers2 {
    public static void main(String[] args) {
        System.out.println(divide(10, 0));
    }

    public static double divide(int x, int y) throws ArithmeticException {
        double result = 0;
        if (y == 0) {
            throw new ArithmeticException("Ne deli na nol, suka!");
        } else {
            result = (double) x / y;
        }
        return result;
    }
}