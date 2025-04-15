package homework_7.generics.task2;

public class PrintArrayMethod {

    public static <T> void printArray(T[] array) {
        for (T t : array) {
            System.out.println(t);
        }
    }


    public static void main(String[] args) {
        Integer[] array1 = {1, 2, 3, 4, 5};
        String[] array2 = {"Hello", "world", "!"};

        printArray(array1);
        System.out.println();
        printArray(array2);


    }
}
