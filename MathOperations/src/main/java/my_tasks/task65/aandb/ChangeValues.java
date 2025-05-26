package my_tasks.task65.aandb;

import java.util.LinkedList;

public class ChangeValues {


    public static void main(String[] args) {
        int a = 10;             // 00001010
        int b = 1;              // 00000001
        a = a ^ b;              // 00001011 (11)
        System.out.println(a);  // 00000001
        b = a ^ b;              // 00001010
        System.out.println(b);  // 00001011
        a = a ^ b;                  // 00000001
        System.out.println(a);


//        a = a + b;
//        b = a - b;
//        a = a - b;
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);


//        a = a + b;
//        System.out.println(a);
//        b = a.substring(0, a.length() - b.length());
//        System.out.println("b = " + b);
//        a = a.substring(b.length());
//        System.out.println("a = " + a);
//        changeVariables(a, b);
//
//        HashMap<String, Integer> hashMap = new HashMap<>();
//        hashMap.put("a", a);
//        hashMap.put("b", b);
//
//        a = hashMap.get("b");
//        b = hashMap.get("a");
//
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);
//
//        LinkedList<Integer> linkedList = new LinkedList<>();
//        linkedList.addFirst(a);
//        linkedList.addLast(b);
//
//        a = linkedList.getLast();
//        b = linkedList.getFirst();
//
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);
//
    }

    public static <T> void changeVariables(T a, T b) {
        LinkedList<T> linkedList = new LinkedList<>();
        linkedList.addFirst(a);
        linkedList.addLast(b);

        a = linkedList.getLast();
        b = linkedList.getFirst();

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
