package homework_6.hashSet;

import java.util.*;

public class Method {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, "Hi", "my", "name", "Hi", "is", "is", "Yura", "Hi");
        System.out.println(arrayList);
        System.out.println();

        System.out.println(fromListToSet(arrayList));
    }

    public static Set<String> fromListToSet(List<String> list) {
        HashSet<String> hashSet = new HashSet<>(list);
        return hashSet;
    }

}
