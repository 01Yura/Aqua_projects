package my_tasks.task24;

public class ArithmeticClass {
    public static void main(String[] args) {
        System.out.println(ArithmeticClass.digitalRoot(987));
    }

    public static int digitalRoot(int n) {
        int sum = 0;
        while (n >= 10) {
            String s = Integer.toString(n);
            char[] array = s.toCharArray();
            for (char c : array) {
                sum += Character.getNumericValue(c);
            }
            n = sum;
            sum = 0;
        }
        return n;
    }
}
