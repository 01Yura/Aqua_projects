package no_bugs.practice_5.generics.task1_2;

public class ArrayMethod {
    public static void main(String[] args) {
        Integer[] arrayOfIntegers = {1, 2, 3, 4, 5};
        String[] arrayOfStrings = {"Hello", " ", "world", "!"};

        printArray(arrayOfIntegers);
        printArray(arrayOfStrings);
    }

    public static <T> void printArray(T[] array) {
        for (T t : array) {
            System.out.print(t + " ");
        }
    }

}
