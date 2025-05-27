package my_tasks.interwiews.sumofdigits;

import java.util.Objects;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumOFDigits(98));
    }

    public static int sumOFDigits(int num) {

        while (num >= 10) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num = num / 10;
            }
            num = sum;
        }
        return num;
    }
}
