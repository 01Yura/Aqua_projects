package homework_6.linkedHashSet;

import java.util.Collections;
import java.util.LinkedHashSet;

public class AddElement {

    public static void addElement(LinkedHashSet<Integer> set, int element) {
        set.add(element);
        System.out.println(set);
    }


    public static void main(String[] args) {
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        Collections.addAll(linkedHashSet, 1, 2, 3, 4, 5);
        System.out.println(linkedHashSet);

        addElement(linkedHashSet, 10);
        addElement(linkedHashSet, 5);
    }
}
