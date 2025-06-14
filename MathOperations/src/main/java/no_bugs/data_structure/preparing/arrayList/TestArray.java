package no_bugs.data_structure.preparing.arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class TestArray {
    public static void main(String[] args) {
        ArrayList<Integer> myArrayList = new ArrayList<>();
        Collections.addAll(myArrayList, 1, 2, 3, 4, 5, 0, 9, 8, 7, 6, 5);
        System.out.println(myArrayList);

        System.out.println(Collections.max(myArrayList));
        System.out.println(Collections.min(myArrayList));
    }
}
