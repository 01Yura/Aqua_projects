package data_structure.preparing.arrayList;

import java.util.ArrayList;
import java.util.Collections;


//Создайте ArrayList из 5 чисел. Добавьте ещё одно число в конец. Выведите весь список.

public class FiveNumbers1 {
    public static void main(String[] args) {
        ArrayList<Integer> myArrayList = new ArrayList<>();

        Collections.addAll(myArrayList, 5, 12, 77, 24, 19);

        System.out.println(myArrayList);

        myArrayList.add(71);

        System.out.println(myArrayList);
        System.out.println();

    }

}

