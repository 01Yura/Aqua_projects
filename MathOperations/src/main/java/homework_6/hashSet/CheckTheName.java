package homework_6.hashSet;

import java.util.Collections;
import java.util.HashSet;

public class CheckTheName {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        Collections.addAll(names, "Kolya", "Petya", "Masha");

        String myName = "Yura";
        boolean flag = false;
        for (String name : names) {
            if (name.equals(myName)) {
                System.out.println("Your name " + name + " has been found in the set");
                flag = true;
                break;
            } else {
                flag = false;
            }

        }
        if (flag == false) {
            System.out.println("Your name " + myName + " has not been found in the set!!!");
        }

    }
}
