package no_bugs.debug;

public class DebugTask6 {
    public static void main(String[] args) {
        countdown(5);
    }

    public static void countdown(int n) {
        while (n >= 1) {
            System.out.println(n);
            n--;
        }
        
    }
}