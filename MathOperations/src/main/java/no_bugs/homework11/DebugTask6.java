package no_bugs.homework11;

//Код должен напечатать числа от n до 1, но программа падает с StackOverflowError.

public class DebugTask6 {
    public static void main(String[] args) {
        countdown(5);
    }

    public static void countdown(int n) {
        for (int i = n; i >= 1; i--) {
            System.out.println(i);
        }

    }
}