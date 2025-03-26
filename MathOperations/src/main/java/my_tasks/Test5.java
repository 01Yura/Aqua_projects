package my_tasks;

import java.util.HashSet;
import java.util.Iterator;

public class Test5 {
    public static void main(String[] args) {
        HashSet<String> namesHashSet = new HashSet<String>();

        namesHashSet.add("Roma");
        namesHashSet.add("Lena");
        namesHashSet.add("Vasa");
        namesHashSet.add("Dima");
        namesHashSet.add("Mira");
        namesHashSet.add("Boba");

        // Вывод с использованием for-each
//        for (String a : namesHashSet) {
//            System.out.print(a + " ");
//        }

        System.out.println();

        // Вывод с использованием итератора
        Iterator iter = namesHashSet.iterator();
        while (iter.hasNext()) {
            String s = (String) iter.next();
            if (s.toCharArray()[0] == 'V') {
                iter.remove();
                System.out.println(s + " ");
            }


        }
        System.out.println(namesHashSet);
    }
}
