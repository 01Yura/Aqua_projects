package my_tasks.task41;

import java.util.ArrayList;
import java.util.List;

public class SumTwoNumbersInArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 12, 6, 7, 8, 9, 10, 11, 5};
        int num = 20;


        findTwoNumbers(array, 15);
        System.out.println();

        ArrayList<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));
        System.out.println(findSumOfNumbersEqualsTarget(list, 10));
        System.out.println(findSumOfNumbersEqualsTarget(list, 12));
        System.out.println(findSumOfNumbersEqualsTarget(list, 11));
        System.out.println(findSumOfNumbersEqualsTarget(list, 3));
        System.out.println(findSumOfNumbersEqualsTarget(list, 8));
    }

    public static void findTwoNumbers(int[] array, int number) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if ((array[i] + array[j] == number) && !list.contains(array[i]) && !list.contains(array[j]) && i != j) {
                    list.add(array[i]);
                    list.add(array[j]);

                    System.out.println(array[i] + " + " + array[j] + " = " + number);
                }
            }
        }
    }

    public static List<Integer> findSumOfNumbersEqualsTarget(List<Integer> list, int target) {
        List<Integer> indexes = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (i + j == target) {
                    indexes.add(i);
                    indexes.add(j);
                    return indexes;
                }
            }
        }

        return indexes; // если не найдено — пустой список
    }
}
