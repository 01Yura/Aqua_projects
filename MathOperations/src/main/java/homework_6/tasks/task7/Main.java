package homework_6.tasks.task7;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(5);
        treeSet.add(1);
        treeSet.add(9);
        treeSet.add(5);
        treeSet.add(7);
        treeSet.add(8);
        treeSet.add(4);

        treeSet.forEach(System.out::println);
        System.out.println();

        System.out.println(treeSet.getFirst());
        System.out.println(treeSet.getLast());

    }
}
