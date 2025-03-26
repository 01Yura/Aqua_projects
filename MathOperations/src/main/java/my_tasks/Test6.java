package my_tasks;

import java.util.HashMap;
import java.util.HashSet;

public class Test6 {
    public static void main(String[] args) {
        HashMap<Integer, String> storage = new HashMap<>();
        storage.put(5, "Yura");
        storage.put(10, "Max");
        storage.put(3, "Kolya");
        storage.put(15, "Petya");
        storage.put(2, "Vasya");

        System.out.println(storage);

        HashSet<Cat> cats = new HashSet<>();
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());

        System.out.println(cats);
    }
}

class Cat {

}

