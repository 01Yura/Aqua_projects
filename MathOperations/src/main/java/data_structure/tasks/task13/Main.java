package data_structure.tasks.task13;

import java.util.Arrays;

//13. Хранение объектов с частым доступом
//Требуется хранить фиксированное количество элементов, которые часто изменяются, с быстрым доступом к любому из них.

public class Main {
    public static void main(String[] args) {
//        Create array and populate it with int
        int[] storage = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
//        Display array
        System.out.println(Arrays.toString(storage));
//        Change some values via index - O(1)
        storage[0] = 11;
        storage[4] = 44;
        storage[8] = 88;
//        Display array
        System.out.println(Arrays.toString(storage));
//        Display specific values using index - O(1)
        System.out.println(storage[0]);
        System.out.println(storage[4]);
        System.out.println(storage[9]);
    }
}
