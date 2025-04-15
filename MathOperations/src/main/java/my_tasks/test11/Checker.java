package my_tasks.test11;

public interface Checker {

    boolean check(int num);

    default void printIfValid(int num) {
        if (check(num)) {
            System.out.println(num);
        }
    }
}
