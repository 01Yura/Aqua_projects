package my_tasks;

import java.util.ArrayDeque;
import java.util.Stack;

public class Test2 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        for (int i = 0; i < 5; i++) {
            stack.push(i);
            arrayDeque.push(i);
        }
        System.out.print("Stack: ");
        System.out.println(stack);
        System.out.print("ArrayDeque: ");
        System.out.println(arrayDeque);
        System.out.println();


        stack.pop();
        arrayDeque.pop();
        System.out.print("Stack: ");
        System.out.println(stack);
        System.out.print("ArrayDeque: ");
        System.out.println(arrayDeque);
    }


}
