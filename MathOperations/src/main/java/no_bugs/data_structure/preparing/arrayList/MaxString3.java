package no_bugs.data_structure.preparing.arrayList;

import java.util.ArrayList;
import java.util.Collections;

//Создайте ArrayList из строк. Найдите в нём самую длинную строку и выведите её.

public class MaxString3 {
    public static void main(String[] args) {
        ArrayList<String> myArrayList = new ArrayList<>();

        Collections.addAll(myArrayList, "Maxim", "Alexandr", "Yura", "Sam", "Abdulkerim", "Tatyana");

        String maxName = myArrayList.get(0);
        for (String name : myArrayList) {
            if (name.length() > maxName.length()) {
                maxName = name;
            }
        }
        System.out.println(maxName);

    }
}
