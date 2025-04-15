package my_tasks;

import java.util.*;

public class Test12 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Yura");
        hashMap.put(2, "Boris");
        hashMap.put(3, "Nikola");

        for (var entry : hashMap.entrySet()) {
            System.out.println(entry.getValue());
        }

        ArrayList<Integer> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, 1, 2, 3, 4, 5);
        for (var element : arrayList) {
            System.out.println(element);
        }

        int[] array = new int[]{1, 2, 2, 3};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        ArrayList<Integer> arrayList1 = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 1, 3, 5, 7, 9, 0));
        System.out.println(arrayList1);
        System.out.println();
        arrayList1.sort(Comparator.reverseOrder());
        System.out.println(arrayList1);
    }

}
