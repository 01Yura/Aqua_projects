package my_tasks.task33;

import java.util.Arrays;

public class Task33 {

    public static int calculateSumOfDigits(int number) {
        int sum = (number / 100) + ((number / 10) % 10) + (number % 10);
        return sum;
    }

    public static void main(String[] args) {
        int number = 987; //24

        int number3 = 987 % 10;
        System.out.println(number3);

        int number2 = (987 / 10) % 10;
        System.out.println(number2);

        int number1 = 987 / 100;
        System.out.println(number1);

        int sum = number1 + number2 + number3;
        System.out.println(sum);

        System.out.println(calculateSumOfDigits(989));


        String s = Integer.toString(number);
        char[] array = s.toCharArray();
        System.out.println(Arrays.toString(array));

        int sum2 = 0;
        for (int i = 0; i < array.length; i++) {
            sum2 += Character.getNumericValue(array[i]);
        }

        System.out.println(sum2);
    }
}
