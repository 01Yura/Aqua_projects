package practice_1;

public class HelloWorld {
    static int a = 1;

    public static void main(String[] args) {
        System.out.println("Hello, world!");
        System.out.println("This is Yura");
        System.out.println(1 + 2);
        System.out.println(3 * 5);
        System.out.println(a);
        System.out.println(add(3, 5));
        System.out.println(multiply(5, 7));
        System.out.println(divide(5, 7));
        System.out.println(subtract(5, 7));
    }

    public static int add(int x, int y) {
        return x + y;
    }

    public static int multiply(int k, int p) {
        return k * p;

    }

    public static double divide(int h, int j) {
        return h - j;
    }

    public static int subtract(int q, int w) {
        return q / w;
    }
}
