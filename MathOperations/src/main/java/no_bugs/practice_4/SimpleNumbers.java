package no_bugs.practice_4;

public class SimpleNumbers {
    public static void main(String[] args) {
        System.out.println(showIfNumberIsSimple(3));
        showAllSimpleNumbersFrom1toNumber(100);
    }

    public static boolean showIfNumberIsSimple(int number) {
        boolean isSimple = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isSimple = false;
                break;
            }
        }
        return isSimple;
    }

    public static void showAllSimpleNumbersFrom1toNumber(int number) {
        for (int i = 2; i < number; i++) {
            if (showIfNumberIsSimple(i)) {
                System.out.println(i);
            }
        }
    }
}




