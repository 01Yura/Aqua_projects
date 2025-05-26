package my_tasks.interwiews.simplenumber;

public class IsNumberSimpleEx {
    public static void main(String[] args) {
        System.out.println(isSimple(2));
        System.out.println(isSimple(3));
        System.out.println(isSimple(5));
        System.out.println(isSimple(13));
        System.out.println(isSimple(14));
    }

    public static boolean isSimple(int number) {
        if (number == 0 || number == 1) return false;
        for (int i = 2; i <= number; i++) {
            if (number % i == 0 && number != i) return false;
        }
        return true;
    }
}
