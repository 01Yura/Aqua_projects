package no_bugs.debug;

public class DebugTask8 {
    public static void main(String[] args) {
        double a = 0.1 * 3;
        double b = 0.3;
        System.out.println(a);
        System.out.println(b);
        if (Math.abs(a - b) < 0.00001) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}
