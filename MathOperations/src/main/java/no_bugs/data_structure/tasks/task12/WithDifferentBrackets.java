package no_bugs.data_structure.tasks.task12;

import java.util.ArrayDeque;
import java.util.HashMap;

public class WithDifferentBrackets {
    public static void main(String[] args) {

        String brackets = "({[]})";

        HashMap<Character, Character> bracketsMap = new HashMap<>();

        bracketsMap.put(')', '(');
        bracketsMap.put('}', '{');
        bracketsMap.put(']', '[');

        ArrayDeque<Character> stack = new ArrayDeque<>();

        char[] arrayOfbrackets = new char[brackets.length()];
        arrayOfbrackets = brackets.toCharArray();


        boolean isValid = true;
        for (char ch : arrayOfbrackets) {
            if (bracketsMap.containsValue(ch)) {
                stack.push(ch);
            } else if (bracketsMap.containsKey(ch)) {
                if (stack.isEmpty()) {
                    isValid = false;
                    break;
                }

                char lastOpened = stack.pop();
                char expected = bracketsMap.get(ch);

                if (lastOpened == expected) {
                    isValid = true;
                } else {
                    isValid = false;
                }
            }

        }

        if (stack.isEmpty() && isValid) {
            System.out.println("OK!");
        } else {
            System.out.println("FAIL!");
        }
    }
}
