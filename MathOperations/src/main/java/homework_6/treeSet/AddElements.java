package homework_6.treeSet;


import java.util.TreeSet;

public class AddElements {
    public static <T> void addElementToSet(TreeSet<T> set, T element) {
        set.add(element);
    }


    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();

        addElementToSet(treeSet, 1);
        addElementToSet(treeSet, 2);
        addElementToSet(treeSet, 3);
        addElementToSet(treeSet, 2);
        addElementToSet(treeSet, 1);

        System.out.println(treeSet);
    }


}
