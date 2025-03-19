package data_structure.preparing.arrayList;

import java.util.ArrayList;
import java.util.Collections;

//Напишите программу, которая удаляет все чётные числа из ArrayList.

public class EvenNumRemover2 {
    public static void main(String[] args) {
        ArrayList<Integer> myArrayList = new ArrayList<>();
        Collections.addAll(myArrayList, 5, 2, 7, 19, 13, 16, 22, 87, 14);
        System.out.println("Оригинальный список: " + myArrayList);

        ArrayList<Integer> copyArrayList = new ArrayList<>();
        copyArrayList.addAll(myArrayList);
        System.out.println("Копия: " + copyArrayList);

        for (Integer number : copyArrayList) {
            if (number % 2 != 0) {
                myArrayList.remove(number);
            }
        }
        System.out.println("Конечный Список: " + myArrayList);
    }
}
