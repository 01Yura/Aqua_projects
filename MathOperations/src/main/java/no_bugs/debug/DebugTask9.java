package no_bugs.debug;

public class DebugTask9 {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = "hello";
        if (str1 == str2) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}