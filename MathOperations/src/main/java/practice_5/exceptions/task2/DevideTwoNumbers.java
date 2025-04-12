package practice_5.exceptions.task2;

//2. Обработка непроверяемого исключения
//Условие задачи: Напишите метод, который принимает на вход два числа и выполняет их деление. Обработайте ситуацию, когда второе число равно нулю, чтобы избежать исключения при делении.


public class DevideTwoNumbers {
    public static void main(String[] args) {
        System.out.println(divide(10, 0));
    }

    public static int divide(int x, int y) throws ArithmeticException {
        int result = 0;
        try {
            result = x / y;
        } catch (ArithmeticException e) {
            System.err.println("The second number should be not 0");
        } finally {
            return result;
        }

    }
}
