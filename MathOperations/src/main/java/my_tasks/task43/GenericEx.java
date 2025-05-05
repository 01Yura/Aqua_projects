package my_tasks.task43;

public class GenericEx {
    public static <T> T myMethod(T a) {
        return a;
    }

    public static void main(String[] args) {
        System.out.println(myMethod(10));
    }
}
