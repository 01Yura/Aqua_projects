package comparison;


import java.util.Stack;

public class Test {
    public static void main(String[] args) {
//        List<String> mylist = new ArrayList<>();
//        mylist.add("Yura");
//        mylist.add("Erik");
//        mylist.add("Andzhei");
//        System.out.println(mylist);
//
//        Collections.sort(mylist);
//        System.out.println(mylist);
//        System.out.println();
//        for (String x : mylist) {
//            System.out.println(x);
//        }


//        LinkedList<String> myLinkedList1 = new LinkedList<>();
//        myLinkedList1.add("Misha");
//        myLinkedList1.add("Egor");
//        myLinkedList1.add("Fedor");
//        System.out.println(myLinkedList1);
//        System.out.println(myLinkedList1);
//        System.out.println(myLinkedList1.remove("Egor"));
//        System.out.println(myLinkedList1);

        Stack<String> myStack = new Stack<>();
        myStack.push("write");
        myStack.add("copy");
        myStack.add("paste");
        myStack.add("delete");
        myStack.pop();
        System.out.println(myStack);
        myStack.forEach(System.out::println);

    }
}
