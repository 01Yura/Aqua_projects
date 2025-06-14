package no_bugs.homework11;

public class DebugTask8 {
    public static void main(String[] args) {
        double a = 0.1 * 3;

        double b = 0.3;
     
        if (a - b < 0.001) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}
