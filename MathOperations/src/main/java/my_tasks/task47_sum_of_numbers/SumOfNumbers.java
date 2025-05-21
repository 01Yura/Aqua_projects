package my_tasks.task47_sum_of_numbers;

public class SumOfNumbers {
    public static void main(String[] args) {
        long start1;
        long end1;
        long start2;
        long end2;
        start1 = System.nanoTime();
        System.out.println(calculateSumOFDigits(1234512));
        end1 = System.nanoTime();
        start2 = System.nanoTime();
        System.out.println(calculateSumOFDigitsUsingMath(1234512));
        end2 = System.nanoTime();
        System.out.println();
        System.out.println(end1 - start1);
        System.out.println(end2 - start2);
    }

    public static int calculateSumOFDigits(int number) {
        String s = String.valueOf(number);
        char[] array = s.toCharArray();

        int sum = 0;
        for (char c : array) {

            sum += Integer.parseInt(((Character) c).toString());
        }

        return sum;
    }

    public static int calculateSumOFDigitsUsingMath(int number) {
        int sum = 0;

        while (number > 0) {
            int num = number % 10; // достаем последнее число
            sum += num;
            number /= 10; // убираем последнее число
        }
        return sum;
    }
}
