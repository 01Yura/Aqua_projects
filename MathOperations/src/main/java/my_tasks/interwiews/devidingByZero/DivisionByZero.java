package my_tasks.interwiews.devidingByZero;

public class DivisionByZero {
    public static void main(String[] args) {
        System.out.println(divide(5, 0));

    }

    public static int divide(int a, int b) {
        try {
            int result = a / b;
            return result;
        } catch (ArithmeticException e) {
            e.printStackTrace();
            return 0;
        }
    }
}
